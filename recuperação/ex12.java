package recuperação;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ex12 {
    public class DocumentoLimitado extends PlainDocument {
        private int tamanhoMax = 15;

        public DocumentoLimitado(int tamanhoMax){
            this.tamanhoMax = tamanhoMax;
        }

        public void insertString(int offset, String str, AttributeSet attr)
                throws BadLocationException {

            if (str == null) return;

            String stringAntiga = getText (0, getLength() );
            int tamanhoNovo = stringAntiga.length() + str.length();

            if (tamanhoNovo <= tamanhoMax) {
                super.insertString(offset, str , attr);
            } else {
                super.insertString(offset, "", attr);
            }
        }
    }
}
