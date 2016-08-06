class key{
public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an 8 char key: ");
        String input;
        try{
            input = br.readLine();
            if (input.length() < 8) {
                System.out.println("Key < 8B. Exiting. . .");
                System.exit(1);
            }
            
            char[] inputKey = input.toCharArray();
            byte[] key64 = new byte[8];
            byte[] key56 = new byte[7];

            
            for (int counter = 0; counter < 8; counter++)
                key64[counter] = (byte) inputKey[counter];

            System.out.print("\n$$ " + new String(key64) + "  $$\n");

           
            for (int counter = 0; counter < KEY_LENGTH - 1; counter++) {
                key64[counter] = (byte) (key64[counter] >>> 1);
                key64[counter] = (byte) (key64[counter] << 1);
            }

            for (int counter = 0; counter < KEY_LENGTH - 1; counter++) {
                key56[counter] = (byte) (key64[counter] << counter);
                key56[counter] = (byte) (key56[counter] | (key64[counter + 1] >>> (KEY_LENGTH - 1 - counter)));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }}