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
        Map<Character, Integer> mapBalloons = new HashMap<>();
        String ballon = "balloon";
        for (int i = 0; i < ballon.length(); i++) {
            mapBalloons.put(ballon.charAt(i), 0);
        }
        for (int i = 0; i < text.length(); i++) {
            mapBalloons.computeIfPresent(text.charAt(i), (key, value) -> ++value);
        }
        int singleLetterMin = mapBalloons.values().stream().min(Integer::compare).get();
        int l = mapBalloons.get('l');
        int o = mapBalloons.get('o');
        int doubleLettesMin = Math.min(l / 2, o / 2);
        return Math.min(singleLetterMin, doubleLettesMin);
    }
}

