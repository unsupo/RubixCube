/**
 *
 *
          10 11 12
          13 14 15
          16 17 18
 20 21 22 30 31 32 40 41 42 50 51 52
 23 24 25 33 34 35 43 44 45 53 54 55
 26 27 28 36 37 38 46 47 48 56 57 58
          60 61 62
          63 64 65
          66 67 68
 *
 * sides patterns
 * 1->7 and 3->5 TOP
 * 3->5 and 1->1 and 7->7 BOTTOM
 * 1->5 and 5->7 RSIDE
 * 1->3 and 1->5 TSIDE
 * 1->3 and 3->7 LSIDE
 * 3->7 and 5->7 BSIDE
 *
 * Cubes with 3 colors
 * 1,2,3   1,3,4   3,4,6   2,3,6
 * 1,4,5   4,5,6   1,2,5   2,5,6
 * 22-30-16    40-32-18   62-38-46   28-36-60
 * 42-50-12    48-56-68   20-52-10   26-58-66
 *
 * Cubes with 1 color are just middle peices 14,24,34,44,54,64
 *
 *
 * The object representation of a rubix cube
 */
public class RubixCube {
    public static void main(String[] args) {

    }

    public RubixCube(){
        //6  1 color center pieces  -- j==4
        //12 2 color middle pieces  -- j is even
        //8  3 color corner pieces  -- j is odd
        Cube[] cubes = new Cube[26];
        // handle center cubes
        for (int i = 0; i < 6; i++)
            cubes[i]=new Cube(new int[]{(i+1)*10+4});
        for (int i = 0; i < 9; i++) {
            //22-30-16
            //17-31
            //18-32-40
            //35-45
            //46-38-62
            //37-61
            //60-36-28
            //25-33
            //Then reverse
            //20-10-52
            //
        }
    }

    int[][] spots; // = new int[][]; 6 sides with 9 spots a piece for normal cube

    /**
     * initializes the rubix cube by colors 0 through sides
     */
    private void init(){
        for (int i = 0; i < spots.length; i++)
            for (int j = 0; j < spots[i].length; j++)
                spots[i][j]=(i+1)*10+j;
    }

    /**
     * A single face of a rubix cube, traditionally a rubix cube has 6 cubes
     * Face seems like a single unit because any rotation rotates a face
     * 3 rows 3 columns
     *
     * Faces affect other faces.  Faces are glued together
     * Rotating a Face rotates the top of all other faces except the opposite face
     */
    public class Face {
        Cube center;
        // middle order goes left,top,right,bottom
        // corner order goes top-left,top-right,bottom-left,bottom-right
        Cube[] middle = new Cube[4], corners = new Cube[4];
        public Face(int center){
            this.center = new Cube(new int[]{center});
            this.middle = new Cube[]{
//                    new Cube(new int[]{10*(i+1)+1,3}),
//                    new Cube(new int[]{10*(i+1)+3,3}),
//                    new Cube(new int[]{10*(i+1)+5,3}),
//                    new Cube(new int[]{10*(i+1)+7,3}),
            };
            this.corners = new Cube[]{

            };
        }
    }
//
//    /**
//     * A row of a rubix cube with 3 cubes
//     */
//    public class Row {
//
//    }
//
//    /**
//     * A Column of a rubix cube with 3 cubes
//     */
//    public class Column {
//
//    }

    /**
     * A single square on a side
     * Some squares have 1, 2 or 3 colors
     * Each should represent a unique number for debugging and for
     */
    public class Cube {
        int[] colors;

        public Cube(int[] colors){
            this.colors = colors;
        }
    }
}
