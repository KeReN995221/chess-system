package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw  new BoardExeption("Error, There must more rows or colums");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int column){
        if(!positionExisits(row, column)){
            throw new BoardExeption("Position not on the board");
        }
        return pieces[row][column];
    }
    public Piece piece (Position position){
        if(!positionExisits(position)){
            throw new BoardExeption("Position not on the board");
        }
        return pieces[position.getRow()][position.getColum()];
    }

    public void placePiece(Piece piece, Position position){
        if(thereIsPiece(position)){
            throw new BoardExeption("There is already a piece on position");
        }
        pieces[position.getRow()][position.getColum()] = piece;
        piece.position = position;
    }

    private boolean positionExisits(int row, int column){
        return row >= 0 && row < rows && column >=0 && column < columns;
    }
    public boolean positionExisits(Position position){
        return positionExisits(position.getRow(), position.getColum());
    }

    public boolean thereIsPiece(Position position){
        if(!positionExisits(position)){
            throw new BoardExeption("Position not on the board");
        }
        return piece(position) != null;
    }

}
