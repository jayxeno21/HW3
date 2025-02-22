package cs101;

public class CompeteStrategy implements Player {

	Mark mark = Mark.X;

	@Override
	public void make_next_move(Board board) {

		// add code here to make one move at a time
		boolean played = false;
		if (!played) {
			played = board.play_middle_center(mark);
		}
		if (!played) {
			played = board.play_top_right(mark);
		}
		if (!played) {
			played = board.play_bottom_left(mark);
		}
		if (!played) {
			played = board.play_middle_right(mark);
		}
		if (!played) {
			played = board.play_top_center(mark);
		}
		if (!played) {
			played = board.play_middle_left(mark);
		}
		if (!played) {
			played = board.play_bottom_right(mark);
		}

	}

}
