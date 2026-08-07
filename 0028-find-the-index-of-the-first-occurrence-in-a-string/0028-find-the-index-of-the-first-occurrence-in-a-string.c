int strStr(char* haystack, char* needle) {
    char *p = strstr(haystack, needle);
    return p ? p - haystack : -1;
}