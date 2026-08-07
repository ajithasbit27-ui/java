int maxArea(int* height, int heightSize) {
    int max = 0, l = 0, r = heightSize - 1;
    while (l < r) {
        int h = height[l] < height[r] ? height[l] : height[r];
        int area = h * (r - l);
        if (area > max) max = area;
        if (height[l] < height[r]) l++;
        else r--;
    }
    return max;
}