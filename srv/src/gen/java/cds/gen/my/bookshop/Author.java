package cds.gen.my.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;

@CdsName("my.bookshop.author")
public interface Author extends CdsData {
  String ID = "ID";

  String NAME = "name";

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getName();

  void setName(String name);

  Author_ ref();

  static Author create() {
    return Struct.create(Author.class);
  }
}
