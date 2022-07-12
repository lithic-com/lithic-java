#!/usr/bin/env pwsh

function Color ($attr) {
    return "$([char]27)[$([int]$attr)m"
}

$RED = (Color 31)
$GREEN = (Color 32)
$YELLOW = (Color 33)
$NC = (Color 0) # No Color

function Is-Overriding-Api-Base-Url {
    return Test-Path 'env:API_BASE_URL'
}

function Is-Prism-Running {
    try {
        $response = Invoke-WebRequest -URI http://localhost:4010
    }
    catch {
        $exception = $_.Exception
        if ($exception -is [System.Net.Sockets.SocketException]) {
            return $false
        }
        if ($exception -is [System.Net.WebException]) {
            # do not fail on http errors
            return $true
        }
        return $false
    }
    return $true
}

if (Is-Overriding-Api-Base-Url) {
    # If someone is running the tests against the live API, we can trust they know
    # what they're doing and exit early.
    Write-Output "${GREEN}Running tests against ${API_BASE_URL}${NC}"
    exit
} elseif (Is-Prism-Running) {
    Write-Output "${GREEN}Mock prism server is running with your OpenAPI spec${NC}"
    exit
} else {
    Write-Output "${RED}ERROR:${NC} The test suite will not run without a mock Prism server"
    Write-Output "running against your OpenAPI spec."
    Write-Output ""
    Write-Output "${YELLOW}To fix:${NC}"
    Write-Output ""
    Write-Output "1. Install Prism (requires Node 16+):"
    Write-Output ""
    Write-Output "  With npm:"
    Write-Output "    $ ${YELLOW}npm install -g @stoplight/prism-cli${NC}"
    Write-Output ""
    Write-Output "  With yarn:"
    Write-Output "    $ ${YELLOW}yarn global add @stoplight/prism-cli${NC}"
    Write-Output ""
    Write-Output "2. Run the mock server"
    Write-Output ""
    Write-Output "  To run the server, pass in the path of your OpenAPI"
    Write-Output "  spec to the prism command:"
    Write-Output ""
    Write-Output "    $ ${YELLOW}prism mock path/to/your.openapi.yml${NC}"
    Write-Output ""

    throw "Test server not running"
}
