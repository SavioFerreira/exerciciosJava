public class App {
    public static void main(String[] args) {

        System.out.println("Email validation exercise");
        String[] validEmails = { "chopa@validation.com", "monkey_d@validation.com",
                "chopper.doctor@validation.com", "chopa-marchal@validation.com",
                "chopA123@validation.com", "Chopa@validation.com",
                "chopa@doc.validation.com", "chop@vali-dation.com", "chopa@email.me",
                "chopa@validation.com"
        };

        String[] invalidEmails = { "", " chop@validation.com", "chopa@validation.com ",
                "tenis @validation.com", "zoro@ validation.com", "brook@validation .com",
                "chopa@validation. com", "chopavalidation.com", "@validation.com",
                "urouge@validation", "chopa@validation.abcdef", "chopper@vali@dation.com",
                "chopa@validation.co1", "chopa@Validation.com", "chopa@validation.Com",
                "chopa.com@validation", "chopa@.com", "chopa@validation.",
                "zo#rao@validation.com", "luffy@vali#dation.com"
        };

        for (String email : validEmails) {
            if (!EmailValidator.validate(email)) {
                throw new RuntimeException(
                        String.format("E-mail \"%s\" is valid, but the validator returned false", email));
            }
        }

        for (String email : invalidEmails) {
            if (EmailValidator.validate(email)) {
                throw new RuntimeException(
                        String.format("E-mail \"%s\" is invalid, but the validator returned true", email));
            }
        }

        System.out.println("Great! that's sounds good. Validator working correctly.");
    }
}
