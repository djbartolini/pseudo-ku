package sudoku.userinterface;

public interface IUserInterfaceContract {
  interface EventListener {
    void onSudokuInput(int x, int y, int input);
    void onDialogueClick();
  }

  interface View {
    void setListener(IUserInterfaceContract.EventListener listener);
    void updateSquare(int x, int y, int input);
    void updateBoard(SudokuGame game);
    void showDialogue(String message);
    void showError(String message);
  }
}
