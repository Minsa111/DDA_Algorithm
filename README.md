# DDA_Algorithm
DDA_Algorithm

The DDA algorithm are according to these rules:

Determine the two points that will be connected.
Determine one point as the starting point (x0, y0) and end point (x1, y1).
Calculate: ∆x = x1 – x0, and ∆y = y1 – y0.
Determine the “step”, which is the maximum of the |∆x| or |∆y|.
If the value of |∆y| > |∆x|, then “step” = |∆y|
If not then “step” = |∆x|
Calculate pixel coordinates, x_increment = ∆x / step and y_increment = ∆y / step.
The next coordinate is (x + x_increment, y + y_increment).
The pixel position at the layer is determined by rounding the coordination value.
Repeat steps 6 and 7 to determine the next pixel position, until x = x1 and y = y1.
