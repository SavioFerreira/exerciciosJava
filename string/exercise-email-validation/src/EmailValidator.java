import java.util.ArrayList;
import java.util.Arrays;

public class EmailValidator {

    private static final int TAMANHO_MAXIMO_DOMINIO_GLOBAL = 3;
    private static final int TAMANHO_MINIMO_DOMINIO_GLOBAL = 2;
    private static final Character IDENTIFICADOR_EMAIL_ARROBA = '@';
    private static final Character IDENTIFICADOR_EMAIL_PONTO = '.';
    private static final String EMPTY = "";

    public static boolean validate(String email) {
        return contemDominioValido(email) && contemNomeValido(email) && naoContemEspacoEmBranco(email);
    }

    private static boolean contemDominioValido(String email) {
        if (contemIdentificadoresEmail(email)) {
            String dominioGlobal = extrairDominioGlobal(email);
            String dominioLocal = extrairDominioLocal(email);

            if (dominioGlobal.isEmpty() || dominioLocal.isEmpty()) {
                return false;
            }

            if (contemDominioLocalAceito(dominioLocal) && contemDominioGlobalAceito(dominioGlobal)) {
                return true;
            }
        }
        return false;
    }

    private static boolean contemDominioLocalAceito(String dominio) {
        for (int i = 0; i < dominio.length(); i++) {
            Character charValue = dominio.toCharArray()[i];
            if (!Character.isLetterOrDigit(charValue) || Character.isUpperCase(charValue)) {
                return charValue.equals('-') || charValue.equals('.') || charValue.equals('_');
            }
        }
        return true;
    }

    private static boolean contemDominioGlobalAceito(String dominio) {
        for (int i = 0; i < dominio.length(); i++) {
            char charValue = dominio.toCharArray()[i];
            if (Character.isDigit(charValue) || Character.isUpperCase(charValue)) {
                return false;
            }
        }
        return dominio.length() <= TAMANHO_MAXIMO_DOMINIO_GLOBAL;
    }

    private static boolean contemCaracterEspecialAceito(Character item) {
        ArrayList<Character> caracteresAceitos = new ArrayList<>(Arrays.asList('-', '_','.'));
        for (Character caracterAceito : caracteresAceitos) {
            if (item.equals(caracterAceito)){
                return true;
            }
        }
        return false;
    }

    private static boolean contemNomeValido(String email) {
        String nome = extrairNomeDoEmail(email);
        boolean ehValido = true;
        for (int i = 0; i < nome.length(); i++) {
            Character charValue = nome.toCharArray()[i];
            if (!Character.isLetterOrDigit(charValue) && !contemCaracterEspecialAceito(charValue)) {
                ehValido = false;
            }
        }
        return ehValido;
    }

    private static boolean contemTamanhoDeDominioGlobalValido(String email) {
        boolean tamanhoMinimo = email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) == email.length() - 1 - TAMANHO_MINIMO_DOMINIO_GLOBAL;
        boolean tamanhoMaximo = email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) == email.length() - 1 - TAMANHO_MAXIMO_DOMINIO_GLOBAL;
        return (tamanhoMinimo || tamanhoMaximo);
    }

    private static boolean contemIdentificadoresValidos(String email) {
        if (contemIdentificadoresEmail(email)) {
            return email.indexOf(IDENTIFICADOR_EMAIL_ARROBA) != 0 && contemTamanhoDeDominioGlobalValido(email);
        }
        return false;
    }

    private static boolean contemIdentificadoresEmail(String email) {
        Integer quantidadeIdentificadorArroba = 0;
        int quantidadeIdentificadorPonto = 0;

        if (email.contains(IDENTIFICADOR_EMAIL_ARROBA.toString()) && email.contains(IDENTIFICADOR_EMAIL_PONTO.toString())) {
            for (int i = 0; i < email.length(); i++) {
                Character charValue = email.toCharArray()[i];
                if (charValue.equals(IDENTIFICADOR_EMAIL_ARROBA)) {
                    quantidadeIdentificadorArroba++;
                }
                if (charValue.equals(IDENTIFICADOR_EMAIL_PONTO)) {
                    quantidadeIdentificadorPonto++;
                }
            }
        }
        return (quantidadeIdentificadorArroba.equals(1) && quantidadeIdentificadorPonto != 0);
    }

    private static boolean naoContemEspacoEmBranco(String email) {
        return !email.contains(" ") && !email.isEmpty();
    }

    private static String extrairNomeDoEmail(String email) {
        String nome = EMPTY;
        if (contemIdentificadoresEmail(email) && contemIdentificadoresValidos(email)) {
            nome = email.substring(0, email.indexOf(IDENTIFICADOR_EMAIL_ARROBA));
        }
        return nome;
    }

    private static String extrairDominioGlobal(String email) {
        String dominio = EMPTY;
        if (contemIdentificadoresEmail(email) && contemIdentificadoresValidos(email)) {
            dominio = email.substring(email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) + 1);
        }
        return dominio;
    }

    private static String extrairDominioLocal(String email) {
        String dominio = EMPTY;
        if (contemIdentificadoresEmail(email) && contemIdentificadoresValidos(email)) {
            dominio = email.substring((email.indexOf(IDENTIFICADOR_EMAIL_ARROBA) + 1), (email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO)));
        }
        return dominio;
    }
}

