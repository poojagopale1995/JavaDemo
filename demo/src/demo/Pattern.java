package demo;

public class Pattern {
	
	public static void main(String args[])
	{
		int row = 5;

        	for(int i = 1; i <= row; ++i) {
        		for(int j = 1; j <= i; ++j) {
                //System.out.print("* ");
                System.out.print(j+" "); //ln
            }
            System.out.println();
        }
	
//******************
        	
        	char last = 'E', alphabet = 'A';

            for(int i = 1; i <= (last-'A'+1); ++i) {
                for(int j = 1; j <= i; ++j) {
                    System.out.print(alphabet + " ");
                }
                ++alphabet;

                System.out.println();
            }
            
//*******************
            
        int rows = 5;   
            for(int i = rows; i >= 1; --i) {
                for(int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        	
        	
	}


