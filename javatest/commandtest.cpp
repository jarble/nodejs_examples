#include <string>
#include <iostream>
#include <stdio.h>
using namespace std;

std::string exec(char* cmd) {
    FILE* pipe = popen(cmd, "r");
    if (!pipe) return "ERROR";
    char buffer[128];
    std::string result = "";
    while(!feof(pipe)) {
        if(fgets(buffer, 128, pipe) != NULL)
                result += buffer;
    }
    pclose(pipe);
    return result;
}

int main(void)
{
        //std::cout << argv[0] << std::endl;
        std::cout << exec("node stuff.js");
        return 1;
}
