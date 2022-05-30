DROP VIEW IF EXISTS CatalogService_Books;

DROP TABLE IF EXISTS my_bookshop_author;
DROP TABLE IF EXISTS my_bookshop_Books;

CREATE TABLE my_bookshop_Books (
  ID INTEGER NOT NULL,
  title NVARCHAR(5000),
  author_ID INTEGER NOT NULL,
  stock INTEGER,
  PRIMARY KEY(ID, author_ID)
);

CREATE TABLE my_bookshop_author (
  ID INTEGER NOT NULL,
  name NVARCHAR(111),
  PRIMARY KEY(ID)
);

CREATE VIEW CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.title,
  Books_0.author_ID,
  Books_0.stock
FROM my_bookshop_Books AS Books_0;

