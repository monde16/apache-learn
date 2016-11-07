package org.nodexy.apacheCommons.math;

import junit.framework.TestCase;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Test;

import static org.nodexy.util.Utils.presentMatrix;
import static org.nodexy.util.Utils.put;

/**
 * Created by phoenix on 11/7/16.
 */
public class MathTest extends TestCase {
    public void test() {
        double[][] data = {{1,2}, {3,4}};
        RealMatrix A = MatrixUtils.createRealMatrix(data);

        put("A = ", A);
        put("2*A = ", A.scalarMultiply(2));

        RealMatrix B = new Array2DRowRealMatrix(2,3);
        put("B = ",B);
        int x = 0;
        for (int i = 0; i < B.getRowDimension(); ++i) {
            for (int j = 0; j < B.getColumnDimension(); ++j) {
                B.setEntry(i,j,++x);
            }
        }
        put("B=\n",presentMatrix(B));
        RealMatrix C = A.multiply(B);
        put("C = A*B =\n", presentMatrix(C));
        put("A.transpose()\n", presentMatrix(A.transpose()));
        put("C.transpose()\n", presentMatrix(C.transpose()));
    }
}
