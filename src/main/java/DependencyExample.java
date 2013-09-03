import java.io.StringReader;

import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.process.Tokenizer;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.TokenizerFactory;

public class DependencyExample {

  public static void main(String[] args) {

    if (args.length != 1) {
      System.err.println("Invalid argument length: " + args.length+". Did you remember to include quotation marks?");
    } else {
      
      StringReader sentenceReader=new StringReader(args[0]);
      TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
      Tokenizer<Word> tokenizer = factory.getTokenizer(sentenceReader);

      System.out.println(tokenizer.tokenize());
    }

  }
}
