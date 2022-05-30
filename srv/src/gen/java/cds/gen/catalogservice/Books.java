package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;

@CdsName("CatalogService.Books")
public interface Books extends CdsData {
  String ID = "ID";

  String TITLE = "title";

  String AUTHOR_ID = "author_ID";

  String STOCK = "stock";

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getTitle();

  void setTitle(String title);

  @CdsName(AUTHOR_ID)
  Integer getAuthorId();

  @CdsName(AUTHOR_ID)
  void setAuthorId(Integer authorId);

  Integer getStock();

  void setStock(Integer stock);

  Books_ ref();

  static Books create() {
    return Struct.create(Books.class);
  }
}
