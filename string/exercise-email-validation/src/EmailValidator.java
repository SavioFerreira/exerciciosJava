import java.util.ArrayList;

public class EmailValidator {

    static final int TAMANHO_MAXIMO_DOMINIO_NACIONAL = 3;
    static final int TAMANHO_MINIMO_DOMINIO_NACIONAL = 2;
    static final Character IDENTIFICADOR_EMAIL_ARROBA = '@';
    static final Character IDENTIFICADOR_EMAIL_PONTO = '.';
    static final String EMPTY = "";

    public static boolean validate(String email) {
        return contemDominioValido(email);
    }

    static boolean contemDominioValido(String email) {


        boolean podeValidarDominio = (contemIdentificadoresEmail(email) && naoContemEspacoEmBranco(email) && contemNomeValido(email) && naoContemEspacoEmBranco(email));

        if (podeValidarDominio) {
            String dominioNacional = dominioNacional(email);
            String dominioLocal = dominioLocal(email);

            if (dominioNacional.isEmpty() || dominioLocal.isEmpty()) {
                return false;
            }

            if (dominioLocalAceito(dominioLocal) && dominioNacionalAceito(dominioNacional)) {
                return dominioNacional.length() <= TAMANHO_MAXIMO_DOMINIO_NACIONAL;
            }
        }
        return false;
    }

    private static boolean dominioLocalAceito(String dominio) {
        for (int i = 0; i < dominio.length(); i++) {
            Character charValue = dominio.toCharArray()[i];
            if (!Character.isLetterOrDigit(charValue) || Character.isUpperCase(charValue)) {
                return charValue.equals('-') || charValue.equals('.') || charValue.equals('_');
            }
        }
        return true;
    }

    private static boolean dominioNacionalAceito(String dominio) {
        for (int i = 0; i < dominio.length(); i++) {
            char charValue = dominio.toCharArray()[i];
            if (Character.isDigit(charValue) || Character.isUpperCase(charValue)) {
                return false;
            }
        }
        return true;
    }

    static boolean contemNomeValido(String email) {
        String nome = nomeEmail(email);

        if (contemIdentificadoresEmail(email)) {
            for (int i = 0; i < nome.length(); i++) {
                Character charValue = nome.toCharArray()[i];
                if (!Character.isLetterOrDigit(charValue)) {
                    return charValue.equals('-') || charValue.equals('.') || charValue.equals('_');
                }
            }
            return true;
        }
        return false;
    }

    static String nomeEmail(String email) {
        if (contemIdentificadoresEmail(email) && contemIdentificadoresValidos(email)) {
            return email.substring(0, email.indexOf(IDENTIFICADOR_EMAIL_ARROBA));
        }
        return EMPTY;
    }

    static String dominioNacional(String email) {
        if (contemIdentificadoresEmail(email) && contemIdentificadoresValidos(email)) {
            return email.substring(email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) + 1);
        }
        return EMPTY;
    }

    static String dominioLocal(String email) {
        if (contemIdentificadoresEmail(email) && contemIdentificadoresValidos(email)) {
            String dominio = email.substring((email.indexOf(IDENTIFICADOR_EMAIL_ARROBA) + 1), (email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO)));
            if (dominio.isEmpty()) {
                return EMPTY;
            }
            return dominio;
        }
        return EMPTY;
    }

    static boolean contemIdentificadoresValidos(String email) {
        if (contemIdentificadoresEmail(email)) {
            return email.indexOf(IDENTIFICADOR_EMAIL_ARROBA) != 0 && (email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) == email.length() - 1 - TAMANHO_MINIMO_DOMINIO_NACIONAL || email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) == email.length() - 1 - TAMANHO_MAXIMO_DOMINIO_NACIONAL);
        }
        return false;
    }

    static boolean contemIdentificadoresEmail(String email) {
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

    static boolean naoContemEspacoEmBranco(String email) {
        return !email.contains(" ") && !email.isEmpty();
    }


    static ArrayList<Character> converterEmailEmArrayDeChar(String email) {
        ArrayList<Character> emailEmArray = new ArrayList<>(email.length());
        for (int i = 0; i < email.length(); i++) {
            emailEmArray.add((char) email.indexOf(i));
        }
        return emailEmArray;
    }
}

