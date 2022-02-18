package Collection.VariableParamater;


// 求N个数的和
public class Practice {
    public static void main(String[] args) {

    int sum1 = getsum(1,2,3,4,5,6);
        System.out.println(sum1);
    }

    public static int getsum(int...arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
  }

