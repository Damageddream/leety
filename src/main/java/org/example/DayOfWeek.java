package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DayOfWeek {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("balllllllllllloooooooooon"));
        System.out.println(maxNumberOfBalloons("balon"));
        System.out.println(maxNumberOfBalloons("\"krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw\""));

    }

    public static int maxNumberOfBalloons(String text) {
        StringBuilder sb = new StringBuilder();
        String ballon = "balloon";
        int counter = 0;
        sb.append(ballon);
        for (int i = 0; i < text.length(); i++) {
            int index = sb.indexOf(String.valueOf(text.charAt(i)));
            if(index != -1){
                sb.deleteCharAt(index);
                if(sb.isEmpty()){
                    counter++;
                    sb.append(ballon);
                }
            }
        }
        return counter;
    }
}

