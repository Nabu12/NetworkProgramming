package encoderdecoder;

import java.net.URLEncoder;
import java.net.URLDecoder;

public class EncoderDecoder {
    public static void main(String[] args) {
        String textToEncode = "Hello World";
        String encodedText = URLEncoder.encode(textToEncode);
        System.out.println("Encoded Text: "+encodedText);
        
        String textToDecode = "Hello%20World%21";
        String decodedText = URLDecoder.decode(textToDecode);
        System.out.println("Decoded Text: "+decodedText);
            
    }
    
}
