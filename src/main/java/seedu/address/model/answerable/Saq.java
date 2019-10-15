package seedu.address.model.answerable;

import seedu.address.model.category.Category;

import java.util.Set;

/**
 * Represents a Answerable in the Test Bank.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Saq extends Answerable {

    /**
     * Every field must be present and not null.
     */
    public Saq(Question question, AnswerSet answers, Difficulty difficulty, Set<Category> categories) {
        super(question, answers, difficulty, categories);
    }
}