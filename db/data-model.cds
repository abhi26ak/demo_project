namespace my.bookshop;

entity Books {
  key ID : Integer;
  title  : String;
  key author_ID : Integer;
  stock  : Integer;
}

entity author {
  key ID : Integer;
  name   : String(111);
}