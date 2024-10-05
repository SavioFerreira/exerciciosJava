import java.util.ArrayList;

public class EmailValidator {

    public static boolean validate(String email) {
        return contemDominioValido(email);
    }

    public static boolean contemDominioValido(String email) {

        final int TAMANHO_MAXIMO_DOMINIO_NACIONAL = 3;
        boolean podeValidarDominio = (naoContemEspacoEmBranco(email) && contemIdentificadorValido(email) && contemNomeValido(email));

        if(podeValidarDominio) {
            String dominioNacional = dominioNacional(email);
            String dominioLocal = dominioLocal(email);
            for (int i = 0; i < dominioNacional.length(); i++) {
                char charValue = dominioNacional.toCharArray()[i];
                if(Character.isDigit(charValue) || Character.isUpperCase(charValue)){
                    return false;
                }
            }

            for (int i = 0; i < dominioLocal.length(); i++) {
                char charValue = dominioLocal.toCharArray()[i];
                if(Character.isDigit(charValue) || Character.isUpperCase(charValue)){
                    return false;
                }
            }

            return dominioNacional.length()  <= TAMANHO_MAXIMO_DOMINIO_NACIONAL;
        }
        return false;
    }

    public static boolean contemNomeValido(String email) {
        String nome = nomeEmail(email);

        if(contemIdentificadorValido(email) && naoContemEspacoEmBranco(email)){
            for (int i = 0; i < nome.length(); i++) {
                Character charValue = nome.toCharArray()[i];
                if(!Character.isLetterOrDigit(charValue)){
                    return charValue.equals('-') || charValue.equals('.') || charValue.equals('_');
                }
            }
            return true;
        }
        return false;
    }

    public static String nomeEmail(String email) {
        if(contemIdentificadorValido(email)){
            return email.substring(0, email.indexOf("@"));
        }
        throw new RuntimeException("O Identificador de E-mail não foi encontrado!");
    }

    public static String dominioNacional(String email) {
        if(contemIdentificadorValido(email)) {
            return email.substring(email.lastIndexOf(".") + 1);
        }
        throw new RuntimeException("O Domínio nacional não foi identificado!");
    }

    public static String dominioLocal(String email) {
        if(contemIdentificadorValido(email)) {
            return email.substring((email.indexOf("@") + 1), (email.lastIndexOf(".")));
        }
        throw new RuntimeException("O Idomínio local não foi identificado!");
    }

    public static boolean contemIdentificadorValido(String email) {
        Integer quantidadeIdentificador = 0;
        for (int i = 0; i < email.length(); i++) {
            Character charValue = email.toCharArray()[i];
            if (charValue.equals('@')) {
                quantidadeIdentificador++;
            }
        }
        return (email.indexOf("@") != 0 && quantidadeIdentificador.equals(1));
    }

    public static boolean naoContemEspacoEmBranco(String email) {
        return !email.contains(" ") && !email.isEmpty();
    }


    public static ArrayList<Character> converterEmailEmArrayDeChar(String email) {
        ArrayList<Character> emailEmArray = new ArrayList<>(email.length());
        for (int i = 0; i < email.length(); i++) {
            emailEmArray.add((char) email.indexOf(i));
        }
        return emailEmArray;
    }
}

