# DDA_Algorithm
DDA_Algorithm

CHECK THE MASTER BRANCH TO SEE THE CODES

The DDA algorithm are according to these rules:

1. Determine the two points that will be connected.
2. Determine one point as the starting point (x0, y0) and end point (x1, y1).
3. Calculate: ∆x = x1 – x0, and ∆y = y1 – y0.
4. Determine the “step”, which is the maximum of the |∆x| or |∆y|.
5. If the value of |∆y| > |∆x|, then “step” = |∆y|
6. If not then “step” = |∆x|
7. Calculate pixel coordinates, x_increment = ∆x / step and y_increment = ∆y / step.
8. The next coordinate is (x + x_increment, y + y_increment).
9. The pixel position at the layer is determined by rounding the coordination value.
10. Repeat steps 6 and 7 to determine the next pixel position, until x = x1 and y = y1.
