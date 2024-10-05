public class EmailValidator {

    private static final int TAMANHO_MAXIMO_DOMINIO_NACIONAL = 3;
    private static final int TAMANHO_MINIMO_DOMINIO_NACIONAL = 2;
    private static final Character IDENTIFICADOR_EMAIL_ARROBA = '@';
    private static final Character IDENTIFICADOR_EMAIL_PONTO = '.';
    private static final String EMPTY = "";

    public static boolean validate(String email) {
        return contemDominioValido(email);
    }

    private static boolean contemDominioValido(String email) {
        boolean podeValidarDominio = (contemIdentificadoresEmail(email) && naoContemEspacoEmBranco(email) && contemNomeValido(email) && naoContemEspacoEmBranco(email));

        if (podeValidarDominio) {
            String dominioNacional = extrairDominioNacional(email);
            String dominioLocal = extrairDominioLocal(email);

            if (dominioNacional.isEmpty() || dominioLocal.isEmpty()) {
                return false;
            }

            if (contemDominioLocalAceito(dominioLocal) && contemDominioNacionalAceito(dominioNacional)) {
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

    private static boolean contemDominioNacionalAceito(String dominio) {
        for (int i = 0; i < dominio.length(); i++) {
            char charValue = dominio.toCharArray()[i];
            if (Character.isDigit(charValue) || Character.isUpperCase(charValue)) {
                return false;
            }
        }
        return dominio.length() <= TAMANHO_MAXIMO_DOMINIO_NACIONAL;
    }

    private static boolean contemNomeValido(String email) {
        String nome = extrairNomeDoEmail(email);

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

    private static String extrairNomeDoEmail(String email) {
        String nome = EMPTY;
        if (contemIdentificadoresEmail(email) && contemIdentificadoresValidos(email)) {
            nome = email.substring(0, email.indexOf(IDENTIFICADOR_EMAIL_ARROBA));
        }
        return nome;
    }

    private static String extrairDominioNacional(String email) {
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

    private static boolean contemIdentificadoresValidos(String email) {
        if (contemIdentificadoresEmail(email)) {
            return email.indexOf(IDENTIFICADOR_EMAIL_ARROBA) != 0 && (email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) == email.length() - 1 - TAMANHO_MINIMO_DOMINIO_NACIONAL || email.lastIndexOf(IDENTIFICADOR_EMAIL_PONTO) == email.length() - 1 - TAMANHO_MAXIMO_DOMINIO_NACIONAL);
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
}

