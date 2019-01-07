import java.util.*;

public class Rubix {

    public static void main(String[] args) {
        /*
        int[][] a = {
            {46,43,40,21,14,27,48,45,42},
            {62,13,68,51,24,37,10,65,16},
            {56,53,50,61,34,17,30,33,36},
            {12,63,18,31,44,57,60,15,66},
            {32,35,38,67,54,11,58,55,52},
            {22,25,28,47,64,41,20,23,26}
        };
*/
//        Rubix r = new Rubix(new int[][]{
//            {26,23,20,47,14,21,28,25,22},
//            {66,65,60,51,24,57,18,63,12},
//            {36,33,30,67,34,61,50,53,56},
//            {16,13,10,37,44,31,68,15,62},
//            {52,55,58,17,54,11,38,35,32},
//            {42,45,48,27,64,41,40,43,46}
//        });
//        Rubix r = new Rubix();
//        Rubix r = new Rubix(new int[][]{
//                {26,23,20,47,14,27,28,25,22},
//                {66,65,60,51,24,57,68,13,62},
//                {36,33,30,67,34,61,38,35,32},
//                {16,63,10,37,44,31,18,15,12},
//                {52,55,58,17,54,11,50,53,56},
//                {46,43,40,21,64,41,48,45,42}});

//        Rubix r = new Rubix(new int[][]{
//                {22,25,28,27,14,41,40,43,46},
//                {16,63,18,57,24,31,68,13,66},
//                {32,35,38,17,34,61,58,55,52},
//                {62,15,60,37,44,51,10,65,12},
//                {36,33,30,11,54,67,50,53,56},
//                {26,23,20,21,64,47,48,45,42}
//        });
//        Rubix r = new Rubix(new int[][]{
//                {46,43,40,47,14,41,28,25,22},
//                {62,65,60,31,24,37,10,13,12},
//                {36,33,30,61,34,11,50,53,56},
//                {16,15,18,51,44,57,68,63,66},
//                {32,35,38,67,54,17,58,55,52},
//                {42,45,48,21,64,27,20,23,26}
//        });
//        Rubix r = new Rubix(new int[][]{
//                {46, 43, 40, 41, 14, 27, 28, 25, 22},
//                {62, 15, 60, 57, 24, 51, 68, 65, 66},
//                {36, 33, 30, 11, 34, 61, 58, 55, 52},
//                {16, 63, 18, 37, 44, 31, 10, 13, 12},
//                {32, 35, 38, 17, 54, 67, 50, 53, 56},
//                {26, 23, 20, 47, 64, 21, 48, 45, 42}
//        });
//        Rubix r = new Rubix(new int[][]{
//                {22,25,28,21,14,27,40,43,46},
//                {16,13,18,51,24,57,10,15,12},
//                {32,35,38,67,34,17,50,53,56},
//                {62,63,60,31,44,37,68,65,66},
//                {36,33,30,61,54,11,58,55,52},
//                {42,45,48,41,64,47,20,23,26}
//        });
        /* first step
	{46,43,40,47,14,41,48,45,42},
	{62,65,68,57,24,51,60,63,66},
	{56,53,50,11,34,17,58,55,52},
	{12,15,18,31,44,37,10,13,16},
	{32,35,38,61,54,67,30,33,36},
	{26,23,20,27,64,21,28,25,22}*/
        /* solveTopCross2
	{26,23,20,27,14,21,40,43,46},
	{66,63,18,57,24,51,60,15,12},
	{32,35,38,11,34,61,50,53,56},
	{62,13,10,37,44,31,68,65,16},
	{52,55,58,17,54,67,30,33,36},
	{42,45,48,41,64,47,28,25,22}
        */
        /* solveLastStep1
	{42,45,48,27,14,47,28,25,22},
	{12,63,60,57,24,51,10,15,62},
	{36,33,30,11,34,61,38,35,32},
	{16,65,68,37,44,31,18,13,66},
	{56,53,50,17,54,67,58,55,52},
	{46,43,40,41,64,21,20,23,26}
         */
//        Rubix r = new Rubix(new int[][]{
//                {26,23,20,27,14,47,40,43,46},
//                {66,63,18,31,24,37,68,15,16},
//                {32,35,38,61,34,11,30,33,36},
//                {62,65,10,51,44,57,60,13,12},
//                {52,55,58,67,54,17,50,53,56},
//                {22,25,28,41,64,21,48,45,42}
//        });
//        Rubix r = new Rubix(new int[][]{
//                {26,23,20,27,14,21,28,25,22},
//                {66,63,60,31,24,57,18,15,12},
//                {36,33,30,67,34,11,50,53,56},
//                {16,13,10,51,44,37,68,65,62},
//                {52,55,58,61,54,17,38,35,32},
//                {42,45,48,41,64,47,40,43,46}
//        });
//        Rubix r = new Rubix(new int[][]{
//                {26,23,20,27,14,21,48,45,42},
//                {66,63,68,37,24,51,60,65,62},
//                {56,53,50,11,34,17,38,35,32},
//                {12,13,10,31,44,57,18,15,16},
//                {52,55,58,67,54,61,30,33,36},
//                {46,43,40,47,64,41,28,25,22}
//        });
//        Rubix r = new Rubix(new int[][]{
//                {42,45,48,41,14,47,40,43,46},
//                {12,15,18,57,24,51,60,63,66},
//                {32,35,38,11,34,17,58,55,52},
//                {62,65,68,31,44,37,10,13,16},
//                {56,53,50,61,54,67,30,33,36},
//                {26,23,20,27,64,21,28,25,22}
//        });
//        Rubix r = new Rubix(new int[][]{
//                {20,15,42,23,14,45,26,63,48},
//                {52,55,58,17,24,11,38,35,32},
//                {66,27,68,51,34,37,18,21,16},
//                {56,53,50,61,44,67,30,33,36},
//                {12,41,10,57,54,31,60,47,62},
//                {40,13,22,43,64,25,46,65,28}
//        });
//        for (int i = 0; i < 10000; i++) {
//            Rubix r = new Rubix().shuffle(100);
//            r.print();
//            print2DArray(r.spots);
//            r.solve();
//            r.print();
//        }
        //Min Moves: 60
        //Max Moves: 1232
        long s = System.currentTimeMillis();
        int maxMoves = Integer.MAX_VALUE, minMoves = 0;
        for (int i = 0; i < 10000000; i++) {
            Rubix r = new Rubix().shuffle(100);
//        r.print();
            r.solve();
            if(r.moves.size() < maxMoves)
                maxMoves = r.moves.size();
            if(r.moves.size() > minMoves)
                minMoves = r.moves.size();
//        r.print();
//            System.out.println("solved in: " + r.moves.size());
        }
        System.out.println("Min Moves: "+maxMoves);
        System.out.println("Max Moves: "+minMoves);
        long e = System.currentTimeMillis();
        System.out.println((e-s));
//        r.moves.forEach(a-> System.out.print(a+" "));
//        r.swapMTopLMiddle().print();
//        r.swapMTopRMiddle().print();
//        print2DArray(r.spots);
//        r.solve();
    }

    public static void print2DArray(int[][] arr) {
        StringBuilder builder = new StringBuilder("int[][] a = {\n");
        for (int i = 0; i < arr.length; i++) {
            builder.append("\t{");
            for (int j = 0; j < arr[i].length; j++)
                builder.append(arr[i][j] + (j == arr[i].length - 1 ? "}" : ","));
            builder.append("" + (i == arr.length - 1 ? "\n};" : ",\n"));
        }
        System.out.println(builder.toString());
    }

    /*
    figure 1 - produced by: new Rubix().print();
      0 0 0
      1 0 2
      0 3 0
1 0 1 2 0 2 3 0 3 4 0 4
1 1 2 1 2 2 1 3 2 1 4 2
1 3 1 2 3 2 3 3 3 4 3 4
      5 0 5
      1 5 2
      5 3 5

    figure 2 - produced by: new Rubix().print();
         10 11 12
         13 14 15
         16 17 18
20 21 22 30 31 32 40 41 42 50 51 52
23 24 25 33 34 35 43 44 45 53 54 55
26 27 28 36 37 38 46 47 48 56 57 58
         60 61 62
         63 64 65
         66 67 68
     */

    int[][] spots; // = new int[][]; 6 sides with 9 spots a piece for normal cube

    public Rubix() {
        this(6, 9);
    }

    public Rubix(int sides, int spots) {
        this.spots = new int[sides][spots]; //idexed by side 1, spot 2 is b side third in from the top
        init();
    }

    public Rubix(int[][] spots) {
        this.spots = spots;
    }

    public Rubix(String s) {
        this();
        for (String c : s.split(" "))
            rotate(c);
    }

    /**
     * initializes the rubix cube by colors 0 through sides
     */
    private void init() {
        for (int i = 0; i < spots.length; i++)
            for (int j = 0; j < spots[i].length; j++)
                spots[i][j] = (i + 1) * 10 + j;
    }
    boolean recordMoves = false;
    /**
     * This method solves the current state of the rubix cube and returns the steps to
     * solve it the returned steps are like, R, R', L, L' ect
     *
     * @return list of moves to solve the rubix cube
     */
    public List<Character> solve() {
        //TODO
        recordMoves=true;
        String solveType = "Traditional";
        switch (solveType){
            case "AStar": break;
            case "Traditional": _traditional(); break;
            case "Bruteforce": _bruteForce(this); break;
        }
        recordMoves=false;
        return null;
    }

    char[] m = {'R', 'L', 'U', 'D', 'F', 'B', 'r', 'l', 'u', 'd', 'f', 'b'};
    private static HashMap<Integer,Rubix> memoize = new HashMap<>();
    private void _bruteForce(Rubix rubix) {
        if(!memoize.containsKey(rubix.hashCode()))
            memoize.put(rubix.hashCode(),rubix);
        if(rubix.isSolved())
            return;
        Rubix r = clone();
        for(char c : m) {
            Rubix v = r.rotate(c);
            if(memoize.containsKey(v.hashCode()))
                continue;
            _bruteForce(v.clone());
        }
    }

    private void _traditional() {
        // get white cross // white is face 0
        solveForCross1(0, 6,true);
        solveForCross2(0,6,true);
        // Swap edges ie 17<->31 =  F' U L' U'
        solveFirstLayer();
        solveSecondLayer();
        solveTopCross1();
        solveTopCross2();
        solveLastStep1();
        solveLastStep2();
        solveLastStep3();
    }

    private void solveLastStep3() {
        int color = spots[2][4]/10;
        while (spots[2][0]/10!=color)
            rotate('U');
        while (spots[2][6]/10!=color)
            rotate('D');
    }

    private void solveLastStep2() {
        // now all spots are aligned just put them into place if they aren't in place
        int color = spots[0][4]/10;
        while (true){
            if(spots[0][0]/10==color && spots[0][2]/10==color && spots[0][6]/10==color && spots[0][8]/10==color)
                return;
            if(spots[0][8]/10==color)
                rotate('U');
            rotate("R' D' R D".split(" "));
        }
    }

    private void solveLastStep1() {
        // align corner pieces so they are in the place, but not necessarily in the right orientation
        // loop over all corners and find the ones that are in the right place
        // {(0,6),(1,2),(2,0)} // {(0,8),(3,0),(2,2)} // {(0,0),(1,0),(4,2)} // {(0,2),(3,2),(4,0)}
        while (true) {
            boolean[] check = {
                    (spots[0][6] / 10 == 1 || spots[0][6] / 10 == 2 || spots[0][6] / 10 == 3) &&
                            (spots[1][2] / 10 == 1 || spots[1][2] / 10 == 2 || spots[1][2] / 10 == 3) &&
                            (spots[2][0] / 10 == 1 || spots[2][0] / 10 == 2 || spots[2][0] / 10 == 3),
                    (spots[0][8] / 10 == 1 || spots[0][8] / 10 == 3 || spots[0][8] / 10 == 4) &&
                            (spots[2][2] / 10 == 1 || spots[2][2] / 10 == 4 || spots[2][2] / 10 == 3) &&
                            (spots[3][0] / 10 == 1 || spots[3][0] / 10 == 4 || spots[3][0] / 10 == 3),
                    (spots[0][0] / 10 == 1 || spots[0][0] / 10 == 2 || spots[0][0] / 10 == 5) &&
                            (spots[1][0] / 10 == 1 || spots[1][0] / 10 == 2 || spots[1][0] / 10 == 5) &&
                            (spots[4][2] / 10 == 1 || spots[4][2] / 10 == 2 || spots[4][2] / 10 == 5),
                    (spots[0][2] / 10 == 1 || spots[0][2] / 10 == 4 || spots[0][2] / 10 == 5) &&
                            (spots[3][2] / 10 == 1 || spots[3][2] / 10 == 4 || spots[3][2] / 10 == 5) &&
                            (spots[4][0] / 10 == 1 || spots[4][0] / 10 == 4 || spots[4][0] / 10 == 5),
            };
            if (check[0] && check[1] && check[2] && check[3])
                return; //you're done
            if (!check[0] && !check[1] && !check[2] && !check[3]){
                rotate("URulUruL".toCharArray());
                continue;
            }
            for (int i = 0; i < check.length; i++)
                if(check[i]){
                    rotate(translateMoves(i==0?1:i==1?2:i==2?4:3,"URulUruL".toCharArray()));
                    break;
                }

        }
    }

    /**
     * This method lines up the correct colors for the top cross
     */
    private void solveTopCross2() {
        //verify top cross
        boolean[] matchers = {
                spots[0][1]/10==spots[0][4]/10,
                spots[0][3]/10==spots[0][4]/10,
                spots[0][5]/10==spots[0][4]/10,
                spots[0][7]/10==spots[0][4]/10,
        };
        if(!matchers[0]||!matchers[1]||!matchers[2]||!matchers[3])
            solveTopCross1();
        // check other colors
        while (true) {
            boolean[] sides = {
                    spots[1][1] / 10 == spots[1][4]/10,
                    spots[2][1] / 10 == spots[2][4]/10,
                    spots[3][1] / 10 == spots[3][4]/10,
                    spots[4][1] / 10 == spots[4][4]/10,
            };
            if (sides[0] && sides[1] && sides[2] && sides[3])
                return; //you're done with this step
            if (!sides[0] && !sides[1] && !sides[2] && !sides[3]) {
                rotate('U');
                continue;
            }
            boolean twoInRow = false;
            int a=-1,b=-1, c = 0;
            for (int i = 0; i < sides.length; i++)
                if(sides[i]) {
                    if(sides[i] && sides[i-1<0?3:i-1]) {
                        a=i;
                        b=i-1<0?5:i-1;
                        twoInRow = true;
                        break;
                    }
                    c++;
                }
            // if c = 0 (might never be 0) or 1 then do below if c = 2 or 3 (might never be 3)
            if(twoInRow){
                rotate(translateMoves(a+1,"URUrURUUr".toCharArray()));
            }else {
                // find a correct side then run the algorithm from that side
                // R U r U R U U r
                for (int i = 0; i < sides.length; i++)
                    if (sides[i]) {
                        rotate(translateMoves(i == 0 ? 1 : i == 1 ? 2 : i == 2 ? 3 : 4, "RUrURUUr".toCharArray()));
                        break;
                    }
            }
        }
    }

    private void solveTopCross1() {
        int face = 0, color = face+1;
        if(checkForCross(face,color))
            return;
        //if no correct colors then do it 3 times
        //if 3 correct then hold it like: and do it 2 times
        //   0                0
        // 1 *   1 *    * 2   * 1
        //         3    3
        //if 3 correct in a line then do it once holding like:
        // 1 * 2 or  0
        //           *
        //           3
        boolean[] cross = {
                isColor(face, 1, color),
                isColor(face, 3, color),
                isColor(face, 5, color),
                isColor(face, 7, color)
        };
        if(!cross[0]&&!cross[1]&&!cross[2]&&!cross[3]) {
            rotate("FRUruf".toCharArray());
            solveTopCross1();
            return;
        }
        if(cross[1]&&cross[2]) {
            rotate("FRUruf".toCharArray());
            return;
        }if(cross[0]&&cross[3]) {
            rotate(translateMoves(3, "FRUruf".toCharArray()));
            return;
        }
        int f = 2;
        if(cross[1]&&cross[3]) f = 3;
        if(cross[2]&&cross[3]) f = 4;
        if(cross[0]&&cross[2]) f = 1;
        for (int i = 0; i < 2; i++)
            rotate(translateMoves(f, "FRUruf".toCharArray()));
    }

    private void solveSecondLayer() {
        // check if middle right is correct
        // check if middle left is correct
        // if not for one or both of above rotate top until colors belonging to middle right or left are present
        // perform algorithm once to get it either left or right
        // check next face and repeat
        int e = 0;
        while (e<4) {
            int l=5,m=2,n=3, d = 2;
            for (int i = 0; i < 4; i++) {
                if (spots[m - 1][5] / 10 == m && spots[n - 1][3] / 10 == n && spots[m - 1][3] / 10 == m && spots[l - 1][5] / 10 == l) { //right check then left check
                    m++;
                    n++;
                    l++;
                    if (m > 5)
                        m = 2;
                    if (n > 5)
                        n = 2;
                    if (l > 5)
                        l = 2;
                    e++;
                    if(e >= 4)
                        break;
                    continue;
                }
                int c = 0, f = 0;
                while (correctMiddleMover(m, n) == -1) { //can move left or right
                    if(isMiddleDone())
                        break;
                    if (++c > 4) { //don't do them all, just do the one that needs to be done
                        if(f>4) break;
                        c = 0; //if you didn't find a single square that could move then try to free a trapped one
//                        int j = d;
                        for (int j = 2; j <= 5; j++) {
                            int k = spots[j-1][4]/10;
                            //if it's not a top or bottom color
                            if(!(spots[j-1][5]/10 == 6 || spots[j-1][5]/10 == 1))
                                if (!(spots[j - 1][5] / 10 == k && spots[j == 5 ? 1 : j][3] / 10 == spots[j == 5 ? 1 : j][4] / 10))
                                    rotate(translateMoves(j - 1, "URurufUF".toCharArray()));
                            if(!(spots[j-1][5]/10 == 6 || spots[j-1][5]/10 == 1))
                                if (!(spots[j - 1][3] / 10 == k && spots[j == 2 ? 4 : j - 2][5] / 10 == spots[j == 2 ? 4 : j - 2][4] / 10))
                                    rotate(translateMoves(j - 1, "ulULUFuf".toCharArray()));
                        }
                        f++;
                        d++;
                        if(d>5)
                            d=2;
                        continue;
                    }
                    rotate('U');
                }
                int cm = correctMiddleMover(m, n);
                if (cm == 0)//right match
                    rotate(translateMoves(m - 1, "URurufUF".toCharArray()));
                else if(cm == 1)
                    rotate(translateMoves(m - 1, "ulULUFuf".toCharArray()));
                i--;
                if(f>4){
                    m++;
                    n++;
                    l++;
                    if (m > 5)
                        m = 2;
                    if (n > 5)
                        n = 2;
                    if (l > 5)
                        l = 2;
                };
            }
        }
    }
    private boolean isMiddleDone(){
        for (int i = 1; i < 5; i++)
            for (int j = 3; j < 6; j++)
                if(spots[i][j]!=(i+1)*10+j)
                    return false;
        return true;
    }

    private int correctMiddleMover(int m, int n) {
        int i = 0;
        switch (m){
            case 2: i=3; break;
            case 3: i=7; break;
            case 4: i=5; break;
            case 5: i=1; break;
        }
        int a = spots[m-1][1]/10, b = spots[0][i]/10, c = m-1;
        if(n-1==2) c=5;
        if(!( a == m && (b == n || b == c)))
            return -1; //no match
        if(a == m && b == n)
            return 0; //right match
        return 1; //left match
    }

    private void solveFirstLayer() {
        //if bottom corner or top corner has all 3 colors then perform method stage2()
        // check face 6 {2,3} then 6 {3,4} then 6 {4,5} then 6 {5,2}
        int solvingColor = 6, m=2,n=3;
        for (int i = 0; i < 4; i++) {
            if(isCorrectCorner(solvingColor,m,n)) {
                m++;
                n++;
                if(n>5)
                    n=2;
                continue;
            }
            int c = 0;
            while (!correctCube(solvingColor,m,n)) {
                if(++c>4){
                    c=0;
                    for (int j = 2; j <= 5; j++)
                        if(!isCorrectCorner(solvingColor,j,j==5?2:j+1))
                            rotate(translateMoves(j==5?1:j,"luLU".toCharArray()));
                    continue;
                }
                rotate('U');
            }while (!isCorrectCorner(solvingColor,m,n))
                rotate(translateMoves(n-1,"luLU".toCharArray()));
            m++;
            n++;
            if(n>5)
                n=2;
        }
    }

    private boolean isCorrectCorner(int solvingColor, int m, int n) {
        int i = 0;
        if(m==3 && n==4)
            i = 2;
        if(m==4 && n==5)
            i = 8;
        if(m==5 && n==2)
            i = 6;
        return spots[m-1][8]/10==m && spots[n-1][6]/10==n && spots[solvingColor-1][i]/10==solvingColor;
    }

    private boolean correctCube(int p, int m, int n) {
        //bottom
        //default cases covers m=2,n=3
        int a = spots[m-1][8]/10, b = spots[n-1][6]/10, c = spots[p-1][0]/10;
        if(m==3 && n==4)
            c = spots[p - 1][2] / 10;
        if(m==4 && n==5)
            c = spots[p - 1][8] / 10;
        if(m==5 && n==2)
            c = spots[p - 1][6] / 10;
        if((a==m || a==n || a==p) && (b==m||b==n||b==p) && (c==m||c==n||c==p))
            return true;
        //top
        a = spots[m-1][2]/10; b = spots[n-1][0]/10; c = spots[opposite(p-1)][6]/10;
        if(m==3 && n==4)
            c = spots[opposite(p-1)][8] / 10;
        if(m==4 && n==5)
            c = spots[opposite(p-1)][2] / 10;
        if(m==5 && n==2)
            c = spots[opposite(p-1)][0] / 10;
        if((a==m || a==n || a==p) && (b==m||b==n||b==p) && (c==m||c==n||c==p))
            return true;
        return false;
    }

    /**
     * This creates a color 6 cross (bottom of rubix cube)
     * It comes after solveForCross1 which lines up the color 6 cross on center color 1
     * Then this method rotates those and aligns them up with the correct color 6 center
     *
     * To make the white cross, you turn the Up layer till you have the two edges on one side matching as shown above.
     * Then After you done that, you will have one piece of the white cross done. Repeat for the other 3 white edges
     * to form a complete white cross on the  Rubik's Cube
     *
     * @param face
     * @param color
     * @param allowOverrides
     */
    private void solveForCross2(int face, int color, boolean allowOverrides) {
        if(!checkForCross(face,color))
            solveForCross1(face,color,allowOverrides);
        // rotate first FF save associated number face 0 => face 2 this will be starting point
        int firstColor = spots[2][1]/10;
        rotate("ff".toCharArray());
        // then rotate correct order: 2,3,4,5 //not 1 or 6 because those are on top and bottom
        // if first color was 2 then rotate U until 3 is in spots[2][1]
        // then rotate D' and flip FF then repeat until all numbers have been flipped
        int[] colors = {2,3,4,5};
        int f = firstColor+1;
        for (int i = 0; i < colors.length; i++)
            if(firstColor==colors[i])
                f=i+1;
        for (int i = 0; i < colors.length-1; i++) {
            int k = colors[f++%colors.length];
            while (!(isColor(2,1,k) && isColor(0,7,color)))
                rotate('U');
            rotate('d');
            rotate("ff".toCharArray());
        }
        while (!isColor(2,7,3))
            rotate('d');
    }

    /**
     * Solves for a cross, this is the first step to solving a rubix cube.
     * This creates the flower pattern (white lily) http://www.learnhowtosolvearubikscube.com/step-1-a-white-lily-on-the-rubiks-cube
     *
     * allow overrides if true is faster but distorts the rest of the cube
     * if false creates more moves but keeps other spots unchanged
     * @param face
     * @param allowOverrides
     */
    public void solveForCross1(int face, int color, boolean allowOverrides) {
        // look for what of the 4 of the cross are missing
        while (!checkForCross(face,color)) {
            boolean[] cross = {
                    isColor(face, 1, color),
                    isColor(face, 3, color),
                    isColor(face, 5, color),
                    isColor(face, 7, color)
            };
            boolean[] faceColorsOpps = {
                    isColor(opposite(face), 1, color),
                    isColor(opposite(face), 3, color),
                    isColor(opposite(face), 5, color),
                    isColor(opposite(face), 7, color)
            };
            if(faceColorsOpps[0] && !cross[3]){
                rotate("FF".toCharArray());
                continue;
            }if(faceColorsOpps[1] && !cross[1]){
                rotate("ll".toCharArray());
                continue;
            }if(faceColorsOpps[2] && !cross[2]){
                rotate("rr".toCharArray());
                continue;
            }if(faceColorsOpps[3] && !cross[0]){
                rotate("bb".toCharArray());
                continue;
            }
            if(faceColorsOpps[0] && !cross[2]){
                rotate("DRR".toCharArray());
                continue;
            }if(faceColorsOpps[0] && !cross[1]){
                rotate("dll".toCharArray());
                continue;
            }if(faceColorsOpps[0] && !cross[0]){
                rotate("ddbb".toCharArray());
                continue;
            }
            if(faceColorsOpps[1] && !cross[2]){
                rotate("ddrr".toCharArray());
                continue;
            }if(faceColorsOpps[1] && !cross[3]){
                rotate("Dff".toCharArray());
                continue;
            }if(faceColorsOpps[1] && !cross[0]){
                rotate("dbb".toCharArray());
                continue;
            }
            if(faceColorsOpps[2] && !cross[1]){
                rotate("DDLL".toCharArray());
                continue;
            }if(faceColorsOpps[2] && !cross[3]){
                rotate("dff".toCharArray());
                continue;
            }if(faceColorsOpps[2] && !cross[0]){
                rotate("DBB".toCharArray());
                continue;
            }
            if(faceColorsOpps[3] && !cross[1]){
                rotate("Dll".toCharArray());
                continue;
            }if(faceColorsOpps[3] && !cross[2]){
                rotate("drr".toCharArray());
                continue;
            }if(faceColorsOpps[3] && !cross[3]){
                rotate("ddFF".toCharArray());
                continue;
            }

            for (int i = 0; i < spots.length; i++) {
                if (i == face || i == opposite(face)) continue;
                boolean[] faceColors = {
                        isColor(i, 1, color),
                        isColor(i, 3, color),
                        isColor(i, 5, color),
                        isColor(i, 7, color)
                };
                if(!faceColors[0]&&!faceColors[1]&&!faceColors[2]&&!faceColors[3])
                    continue;
                // This requires only allowing face 0 for this method
                ////// PROBLEM
                boolean[] t = cross;
                if(i==1)
                    t = changePlaces(t,new int[]{2,0,3,1});
                if(i==3)
                    t = changePlaces(t,new int[]{1,3,0,2});
                if(i==4)
                    t = changePlaces(t,new int[]{3,2,1,0});
                ////// PROBLEM
                if (!t[2] && faceColors[2]) {
                    rotate(translateMove(i, 'R'));
                    break;
                } else if (!t[1] && faceColors[1]) {
                    rotate(translateMove(i, 'l'));
                    break;
                } else if (!t[3] && faceColors[2]) {
                    rotate(translateMoves(i, "uR".toCharArray()));
                    break;
                } else if (!t[1] && faceColors[2]) {
                    rotate(translateMoves(i, "Ul".toCharArray()));
                    break;
                } else if (!t[3] && faceColors[0]) {
                    rotate(translateMoves(i, "FuR".toCharArray()));
                    break;
                } else if (!t[2] && faceColors[1]) {
                    rotate(translateMoves(i, "ffRFF".toCharArray()));
                    break;
                } else if (!t[2] && faceColors[3]) {
                    rotate(translateMoves(i, "fRF".toCharArray()));
                    break;
                } else if (!t[1] && faceColors[3]) {
                    rotate(translateMoves(i, "Flf".toCharArray()));
                    break;
                } else if (!t[0] && faceColors[3]) {
                    rotate(translateMoves(i, "dLbl".toCharArray()));
                    break;
                } else {
                    rotate('U');
                    break;
                }
            }
        }
    }

    private boolean[] changePlaces(boolean[] t, int[] ints) {
        boolean[] a = new boolean[t.length];
        for (int i = 0; i < t.length; i++)
            a[i]=t[ints[i]];
        return a;
    }

    private boolean[] rotateArr(boolean[] arr,int count){
        boolean[] a = {arr[3],arr[0],arr[1],arr[2]};
        if(count==1)
            return a;//0->1->2->3->0
        return rotateArr(a,--count);
    }

    private int opposite(int face) {
        switch (face){
            case 0: return 5;
            case 1: return 3;
            case 2: return 4;
            case 3: return 1;
            case 4: return 2;
            case 5: return 0;
        }
        return -1;
    }

    private char[] translateMoves(int face, char[] moves){
        char[] m = new char[moves.length];
        for (int i = 0; i < moves.length; i++)
            m[i]=translateMove(face,moves[i]);
        return m;
    }
    private char translateMove(int face, char move){
        // All moves are relative to face 2
        if(face == 2) return move;
        int off = 0;
        if((""+move).toLowerCase().equals(""+move)){
            move-=32; // UPPER=LOWER-32
            off=32;
        }
        if(move == 'R')
            switch (face){
                case 1: move='F'; break;
                case 3: move='B'; break;
                case 4: move='L'; break;
            }
        else if(move == 'L')
            switch (face){
                case 1: move='B'; break;
                case 3: move='F'; break;
                case 4: move='R'; break;
            }
        else if(move == 'U')
            switch (face){
                case 0: move='B'; break;
                case 5: move='F'; break;
            }
        else if(move == 'D')
            switch (face){
                case 0: move='F'; break;
                case 5: move='B'; break;
            }
        else if(move == 'F')
            switch (face){
                case 0: move='U'; break;
                case 1: move='L'; break;
                case 3: move='R'; break;
                case 4: move='B'; break;
                case 5: move='D'; break;
            }
        else if(move == 'B')
            switch (face){
                case 0: move='D'; break;
                case 1: move='R'; break;
                case 3: move='L'; break;
                case 4: move='F'; break;
                case 5: move='U'; break;
            }
        move+=off;
        return move;
    }

    private boolean isColor(int face, int v, int color){
        return spots[face][v]/10==color;
    }

    private boolean checkForCross(int face, int color) {
        return isColor(face,3,color) &&
                isColor(face,5,color) &&
                isColor(face,1,color) &&
                isColor(face,7,color);
    }

    // 31->17
    private Rubix swapEdges(){
        return rotate("F' U L' U'".split(" "));
    }

    /**
     * Use the algorithm three times when only the center color is white
     * Use the algorithm two times when there is a pattern that looks like an "L."
     * Use the algorithm once when there is a straight horizontal line.
     * 31->17  longer than above but doesn't disturb whole cube
     * @return
     */
    private Rubix swapEdges2(){
        return rotate("F R U R' U' F'".split(" "));
    }
    // 36->16
    private Rubix swapBLCornerTL(){
        return rotate("D L D' L'".split(" "));
    }
    // 38->18
    private Rubix swapBRCornerTR(){
        return rotate("D' R' D R".split(" "));
    }
    // {17,31}->{25,33}
    private Rubix swapMTopRMiddle(){
        return rotate("U R U' R' U' F' U F".split(" "));
    }
    // {17,31}->{35,43}
    private Rubix swapMTopLMiddle(){
        return rotate("U' L' U L U F U' F'".split(" "));
    }

    private Rubix stage2(){
        return rotate("L' U' L U".split(" "));
    }

    /**
     * This method will simply cound how many squares are in the correct spot
     *
     * @return int value of how close to cube is to being solved
     */
    public int heuristic() {
        int value = 0;
        for (int i = 0; i < spots.length; i++) {
            int rightSpot = spots[i][4] / 10; //center spot never moves so check if spots around it are right
            for (int j = 0; j < spots[i].length - 1; j++) {
                if (j == 4) j++;
                if (spots[i][j] / 10 == rightSpot)
                    value++;
            }
        }
        return value;
    }

    /**
     * prints the rubix cube
     */
    public void print() {
        String pre = "";
        for (int i = 0; i < spots.length+3/*+3*/; i++)
            pre += " ";
        StringBuilder[] builders = new StringBuilder[9];
        for (int i = 0; i < builders.length; i++)
            builders[i] = new StringBuilder();
        for (int i = 0; i < spots.length; i++) {
            int k = 0;
            if (i == 0 || i == 5) {
                for (int j = 0; j < spots[i].length; j++) {
                    if (j % 3 == 0)
                        builders[i + k].append(pre);
//                    builders[i + k].append(translate(spots[i][j]) + " ");
                    builders[i+k].append(spots[i][j]+" ");
                    if ((j + 1) % 3 == 0)
                        builders[i + k++].append("\n");
                }
            } else {
                k = 3;
                for (int j = 0; j < spots[i].length; j++) {
                    builders[k].append(spots[i][j]+" ");
//                    builders[k].append(translate(spots[i][j]) + " ");
                    if ((j + 1) % 3 == 0)
                        k++;
                    if (i == 4 && (j + 1) % 3 == 0)
                        builders[k - 1].append("\n");
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < builders.length; i++)
            builder.append(builders[i].toString());
        System.out.println(builder.toString());
    }

    private String translate(int a) {
        switch (a / 10) {
            case 1:
                return "W";
            case 2:
                return "O";
            case 3:
                return "G";
            case 4:
                return "R";
            case 5:
                return "B";
            case 6:
                return "Y";
        }
        return "UNKNOWN";
    }

    /**
     * Simply performs random rotations and returns a shuffled rubix cube
     * 1000000 many shuffles is resonable
     *
     * @return
     */
    public Rubix shuffle(int count) {
        boolean rr = recordMoves;
        recordMoves = false;
        //32
        StringBuilder builder = new StringBuilder();
        char[] c = {'R', 'L', 'U', 'D', 'F', 'B'};
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            int j = r.nextInt(c.length * 2);
            String s = c[j % c.length] + "";
            char cc = c[j % c.length];
            if (j >= c.length) {
                cc += 32;
                s += "'";
            }
            rotate(cc);
            builder.append(s + " ");
        }
//        System.out.println(builder.toString());
        recordMoves = rr;
        return this;
    }

    /**
     * shuffles it 1000000 many times which takes about 0.2 seconds
     *
     * @return
     */
    public Rubix shuffle() {
        return shuffle(100000);
    }

    /**
     * Test returns true if rubix cube is solved, false otherwise
     *
     * @return
     */
    public boolean isSolved() {
        return Arrays.deepEquals(spots, new int[][]{
                {10, 11, 12, 13, 14, 15, 16, 17, 18},
                {20, 21, 22, 23, 24, 25, 26, 27, 28},
                {30, 31, 32, 33, 34, 35, 36, 37, 38},
                {40, 41, 42, 43, 44, 45, 46, 47, 48},
                {50, 51, 52, 53, 54, 55, 56, 57, 58},
                {60, 61, 62, 63, 64, 65, 66, 67, 68}
        });
    }
    List<String> moves = new ArrayList<>();
    public Rubix rotate(String[] c) {
        for(String s : c)
            rotate(s);
        return this;
    }

    public Rubix rotate(String c) {
        return rotate((char) (c.charAt(0) + (c.length() > 1 ? 32 : 0)));
    }
    public Rubix rotate(char[] c) {
        for(char s : c)
            rotate(s);
        return this;
    }

    /**
     * This simulates rotating the rubix cube all moves are relative to if the cube didn't move from
     * the static position above in figure 2
     * Rubix cubes are 3D so a rotation needs to state whether it's clockwise or counter clockwise and moving the
     * <p>
     * counterOrClock is: 0 for counter clockwise, 1 for clockwise
     * <p>
     * R = Right Face - Right side of the cube
     * L = Left Face - Left side of the cube
     * U = Up Face - Top side of the cube
     * D = Down Face - Bottom side of the cube
     * F = Front Face - Front side of the cube
     * B = Back Face - Back side of the cube
     * <p>
     * Lower case is for reverse
     *
     * @return
     */
    public Rubix rotate(char letter) {
        if(recordMoves)
            moves.add(letter+"");
        switch (letter) {
            case 'R': // R 2 {2,5,8} -> 0 {2,5,8} -> 4 {6,3,0} -> 5 {2,5,8} -> Up(/|\) Right
                rotate(new int[]{2, 2, 5, 8, 0, 2, 5, 8, 4, 6, 3, 0, 5, 2, 5, 8});
                rotateFace(3);
                break;
            case 'l': // L 2 {0,3,6} -> 0 {0,3,6} -> 4 {8,5,2} -> 5 {0,3,6} -> Up(/|\) Left
                rotate(new int[]{2, 0, 3, 6, 0, 0, 3, 6, 4, 8, 5, 2, 5, 0, 3, 6});
                rotateFaceReverse(1);
                break;
            case 'u': // U 2 {0,1,2} -> 3 {0,1,2} -> 4 {0,1,2} -> 1 {0,1,2} -> Right(->) Top
                rotate(new int[]{2, 0, 1, 2, 3, 0, 1, 2, 4, 0, 1, 2, 1, 0, 1, 2});
                rotateFaceReverse(0);
                break;
            case 'D': // D 2 {6,7,8} -> 3 {6,7,8} -> 4 {6,7,8} -> 1 {6,7,8} -> Right(->) Bottom
                rotate(new int[]{2, 6, 7, 8, 3, 6, 7, 8, 4, 6, 7, 8, 1, 6, 7, 8});
                rotateFace(5);
                break;
            case 'F': // F 1 {8,5,2} -> 0 {6,7,8} -> 3 {0,3,6} -> 5 {2,1,0} -> CW Front
                rotate(new int[]{1, 8, 5, 2, 0, 6, 7, 8, 3, 0, 3, 6, 5, 2, 1, 0});
                rotateFace(2);
                break;
            case 'b': // B 1 {6,3,0} -> 0 {0,1,2} -> 3 {2,5,8} -> 5 {8,7,6} -> CW Back
                rotate(new int[]{1, 6, 3, 0, 0, 0, 1, 2, 3, 2, 5, 8, 5, 8, 7, 6});
                rotateFaceReverse(4);
                break;
            case 'r': // R 2 {2,5,8} -> 5 {2,5,8} -> 4 {6,3,0} -> 0 {2,5,8} -> Down(\|/) Right
                rotate(new int[]{2, 2, 5, 8, 5, 2, 5, 8, 4, 6, 3, 0, 0, 2, 5, 8});
                rotateFaceReverse(3);
                break;
            case 'L': // L 2 {0,3,6} -> 5 {0,3,6} -> 4 {8,5,2} -> 0 {0,3,6} -> Down(\|/) Left
                rotate(new int[]{2, 0, 3, 6, 5, 0, 3, 6, 4, 8, 5, 2, 0, 0, 3, 6});
                rotateFace(1);
                break;
            case 'U': // U 2 {0,1,2} -> 1 {0,1,2} -> 4 {0,1,2} -> 3 {0,1,2} -> Left(<-) Bottom
                rotate(new int[]{2, 0, 1, 2, 1, 0, 1, 2, 4, 0, 1, 2, 3, 0, 1, 2});
                rotateFace(0);
                break;
            case 'd': // D 2 {6,7,8} -> 1 {6,7,8} -> 4 {6,7,8} -> 3 {6,7,8} -> Left(<-) Top
                rotate(new int[]{2, 6, 7, 8, 1, 6, 7, 8, 4, 6, 7, 8, 3, 6, 7, 8});
                rotateFaceReverse(5);
                break;
            case 'f': // F 1 {8,5,2} -> 5 {2,1,0} -> 3 {0,3,6} -> 0 {6,7,8} -> CCW Front
                rotate(new int[]{1, 8, 5, 2, 5, 2, 1, 0, 3, 0, 3, 6, 0, 6, 7, 8});
                rotateFaceReverse(2);
                break;
            case 'B': // B 1 {6,3,0} -> 5 {8,7,6} -> 3 {2,5,8} -> 0 {0,1,2} -> CCW Back
                rotate(new int[]{1, 6, 3, 0, 5, 8, 7, 6, 3, 2, 5, 8, 0, 0, 1, 2});
                rotateFace(4);
                break;
        }
        return this;
    }

    /**
     * low level rotate of rubix cube, should only be used by internal class ie the overloaded rotate method
     *
     * @param mover
     * @return
     */
    public Rubix rotate(int[] mover) {// B 1 {6,3,0} -> 5 {8,7,6} -> 3 {2,5,8} -> 0 {0,1,2} -> CCW Back
        int i = 0;
        int[] temp0 = {spots[mover[i]][mover[i + 1]], spots[mover[i]][mover[i + 2]], spots[mover[i]][mover[i + 3]]};
        i = 4;
        int[] temp1 = {spots[mover[i]][mover[i + 1]], spots[mover[i]][mover[i + 2]], spots[mover[i]][mover[i + 3]]};
        i = 8;
        int[] temp2 = {spots[mover[i]][mover[i + 1]], spots[mover[i]][mover[i + 2]], spots[mover[i]][mover[i + 3]]};
        i = 12;
        int[] temp3 = {spots[mover[i]][mover[i + 1]], spots[mover[i]][mover[i + 2]], spots[mover[i]][mover[i + 3]]};
        i = 0;
        spots[mover[i]][mover[i + 1]] = temp3[0];
        spots[mover[i]][mover[i + 2]] = temp3[1];
        spots[mover[i]][mover[i + 3]] = temp3[2];
        i = 4;
        spots[mover[i]][mover[i + 1]] = temp0[0];
        spots[mover[i]][mover[i + 2]] = temp0[1];
        spots[mover[i]][mover[i + 3]] = temp0[2];
        i = 8;
        spots[mover[i]][mover[i + 1]] = temp1[0];
        spots[mover[i]][mover[i + 2]] = temp1[1];
        spots[mover[i]][mover[i + 3]] = temp1[2];
        i = 12;
        spots[mover[i]][mover[i + 1]] = temp2[0];
        spots[mover[i]][mover[i + 2]] = temp2[1];
        spots[mover[i]][mover[i + 3]] = temp2[2];
        return this;
    }

    /**
     * Rotates just a face
     * Should only be used by a lower level internal class method ie rotate method
     *
     * @param faceNum
     * @return
     */
    public Rubix rotateFace(int faceNum) {
        int[] face = spots[faceNum];
        int[] t = {face[0], face[1], face[2], face[3], face[4], face[5], face[6], face[7], face[8]};
        face[0] = t[6];
        face[1] = t[3];
        face[2] = t[0];
        face[5] = t[1];
        face[8] = t[2];
        face[7] = t[5];
        face[6] = t[8];
        face[3] = t[7];
        return this;
    }

    /**
     * Rotates just a face in reverse of rotateFace method
     * Should only be used by a lower level internal class method ie rotate method
     *
     * @param faceNum
     * @return
     */
    public Rubix rotateFaceReverse(int faceNum) {
        int[] face = spots[faceNum];
        int[] t = {face[0], face[1], face[2], face[3], face[4], face[5], face[6], face[7], face[8]};
        face[0] = t[2];
        face[1] = t[5];
        face[2] = t[8];
        face[5] = t[7];
        face[8] = t[6];
        face[7] = t[3];
        face[6] = t[0];
        face[3] = t[1];
        return this;
    }

    /**
     * https://stackoverflow.com/questions/1564832/how-do-i-do-a-deep-copy-of-a-2d-array-in-java
     * Deep copy a 2d in array used to clone the rubix cube
     *
     * @param original
     * @return copied 2d array
     */
    public static int[][] deepCopy(int[][] original) {
        if (original == null) {
            return null;
        }

        final int[][] result = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
            // For Java versions prior to Java 6 use the next:
            // System.arraycopy(original[i], 0, result[i], 0, original[i].length);
        }
        return result;
    }

    @Override
    public Rubix clone() {
        return new Rubix(deepCopy(this.spots));
    }

    @Override
    public String toString() {
//        print(); //TODO
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rubix rubix = (Rubix) o;
        return Arrays.equals(spots, rubix.spots);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(spots);
    }
}

