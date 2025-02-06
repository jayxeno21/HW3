package cs101;

public class OrderedEnemy implements Player {

	private Mark mark = Mark.O;

	@Override
	public void make_next_move(Board board) {

		boolean played = false;

		// attempt to play in the top left slot
		played = board.play_top_left(mark);

		// if that slot was already taken, play in the top center slot
		if (!played) {
			played = board.play_top_center(mark);
		}

		// if that slot was already taken, play in the top right slot
		if (!played) {
			played = board.play_top_right(mark);
		}

		// and so on ...
		if (!played) {
			played = board.play_middle_left(mark);
		}

		if (!played) {
			played = board.play_middle_center(mark);
		}

		if (!played) {
			played = board.play_middle_right(mark);
		}

		if (!played) {
			played = board.play_bottom_left(mark);
		}

		if (!played) {
			played = board.play_bottom_center(mark);
		}

		if (!played) {
			played = board.play_bottom_right(mark);
		}

	}

}
