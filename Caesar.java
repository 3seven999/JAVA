import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        System.out.println("凯撒加密解密器：");
        System.out.println("请选择加密或解密。1.加密 2.解密");
        Scanner in=new Scanner(System.in);
        int choice = in.nextInt();
        switch(choice){
            case 1:
                System.out.println("请输入加密内容：");
                in.nextLine();
                String encryptedContent =  in.nextLine();
                CaesarEncryption1 encrypted =new CaesarEncryption1();
                System.out.println("加密后的内容是：");
                encrypted.CaesarEncryption1(encryptedContent);
                break;
             case 2:
                System.out.println("请输入解密内容：");
                in.nextLine();
                String decryptionContent = in.nextLine();
                CaesarEncryption2  decryption = new CaesarEncryption2();
                System.out.println("解密后的内容是：");
                decryption.CaesarEncryption2(decryptionContent);
                break;
            default:
                System.out.println("输入数据错误");



        }
    }
}
//加密
 class CaesarEncryption1 {
    //小写字母
    public void CaesarEncryption1(String encryptedContent) {
        char[] temp = encryptedContent.toCharArray();
        int[] newtemp = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            newtemp[i] = temp[i];
        }
        //小写字母
        for (int i = 0; i < newtemp.length; i++) {
            if (newtemp[i] <= 122 && newtemp[i] >= 97) {
                if (newtemp[i] == 120) {
                    newtemp[i] = 97;
                } else if (newtemp[i] == 121) {
                    newtemp[i] = 98;
                } else if (newtemp[i] == 122) {
                    newtemp[i] = 99;
                } else {
                    newtemp[i] = newtemp[i] + 3;
                }
            }
            //大写字母
            if (newtemp[i] <= 90 && newtemp[i] >= 65) {
                if (newtemp[i] == 88) {
                    newtemp[i] = 65;
                } else if (newtemp[i] == 89) {
                    newtemp[i] = 66;
                } else if (newtemp[i] == 90) {
                    newtemp[i] = 67;
                } else newtemp[i] = newtemp[i] + 3;
            }
            //数字
            if (newtemp[i] <= 57 && newtemp[i] >= 48) {
                if (newtemp[i] == 55) {
                    newtemp[i] = 48;
                } else if (newtemp[i] == 56) {
                    newtemp[i] = 49;
                } else if (newtemp[i] == 57) {
                    newtemp[i] = 50;
                } else newtemp[i] = newtemp[i] + 3;

            }
        }
            //输出
            for (int i = 0; i < newtemp.length; i++){
             temp[i] = (char) newtemp[i];
                System.out.print(temp[i]); }

    }}

    //解密
    class CaesarEncryption2{
        public  void CaesarEncryption2 (String decryptionContent) {
            char[] temp = decryptionContent.toCharArray();
            int[] newtemp = new int[temp.length];
            for (int i = 0; i < temp.length; i++) {
                newtemp[i] = temp[i];
            }
            for (int i = 0; i < newtemp.length; i++) {
                //小写字母
                if (newtemp[i] <= 122 && newtemp[i] >= 97) {
                    if (newtemp[i] == 99) {
                        newtemp[i] = 122;
                    } else if (newtemp[i] == 98) {
                        newtemp[i] = 121;
                    } else if (newtemp[i] == 97) {
                        newtemp[i] = 120;
                    } else newtemp[i] = newtemp[i] - 3;
                }
                //大写字母
                if (newtemp[i] <= 90 && newtemp[i] >= 65) {
                    if (newtemp[i] == 67) {
                        newtemp[i] = 90;
                    } else if (newtemp[i] == 66) {
                        newtemp[i] = 89;
                    } else if (newtemp[i] == 65) {
                        newtemp[i] = 88;
                    } else newtemp[i] = newtemp[i] - 3;
                }
                //数字
                if (newtemp[i] <= 57 && newtemp[i] >= 48) {
                    if (newtemp[i] == 50) {
                        newtemp[i] = 57;
                    } else if (newtemp[i] == 49) {
                        newtemp[i] = 56;
                    } else if (newtemp[i] == 48) {
                        newtemp[i] = 55;
                    } else newtemp[i] = newtemp[i] - 3;

                }
            }
                //输出
                for (int i = 0; i < newtemp.length; i++) {
                    temp[i] = (char) newtemp[i];
                    System.out.print(temp[i]);

            }
        }
       }
