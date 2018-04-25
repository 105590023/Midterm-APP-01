package tw.edu.ntut.csie.app01_105590023;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGrade {
        String str = "S";
        public String letterGrade(int intGrade){
            if (intGrade > 100) {
                str = " 等第:'X'，輸入分數應介於[0..100]";
            }
            else if(90 <= intGrade && intGrade <= 100){
                str = " 等第:'A'";
            }
            else if(80 <= intGrade && intGrade <= 89){
                str = " 等第:'B'";
            }else if(70 <= intGrade && intGrade <= 79){
                str = " 等第:'C'";
            }else if(60 <= intGrade && intGrade <= 69){
                str = " 等第:'D'";
            }else if(0 <= intGrade && intGrade <= 59){
                str = " 等第:'F'12";
            }
            else{
                str = " 等第:'X'，輸入分數應介於[0..100]";
            }
            return  str;
        }
}
