import java.util.HashMap;
import java.util.List;

//Requirements Stack Overflow
//1. Any non-member (guest) can search and view questions.
//2. Members should be able to post new questions.
//3. Members should be able to add an answer.
//4. Members can add comments to any question or answer.
//5. A member can upvote a question, answer or comment.
//6. Members can flag a question, answer or comment, for serious problems or moderator attention.
//7. Members will earn badges.
//8. Members can vote to delete or close any question.
//9. Moderators can close a question or undelete an already deleted question.

public class StackoverflowLLD {

}

class User{
	List<Question> searchQuestion(String searchString){return null;}
	Question viewQuestion(String question_id){return null;}
}

class Member extends User{
	Badge badge;
	void postNewQuestion(Question question){return;}
	void addAnswer(Question question, Answer answer){return;}
	void addComments(Entity entity,String comment) {return;}
	void Vote(Entity entity, VoteType type) {return;}
	void flag(Entity entity) {return;}
	
}

class Question extends Entity{
	List<Comment> comments;
}
class Answer extends Entity{
	List<Comment> comments;
}
class Comment extends Entity{
	
}
class Entity{
	String _id;
	HashMap<VoteType,Integer> votes = new HashMap<VoteType,Integer>();	
}
 enum VoteType{
	upvote,downvote;
}
enum Badge{
	gold,silver,bronze;
}