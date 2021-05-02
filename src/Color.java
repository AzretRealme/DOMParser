//import java.util.ArrayList;
//import java.util.List;
//
//public class Color {
//    private int id;
//    private String name;
//
//    @Override
//    public String toString() {
//        return "Color{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    public Color(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Color() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}

//    List<javafx.scene.paint.Color> colors = new ArrayList<>();
//        colors.add(new Color(1, "black"));
//        colors.add(new Color(2, "gold"));

//        Good phone = new Good(1, "Galaxy ss20", 111000, "Samsung", colors);
//            ObjectMapper mapper = new XmlMapper();
//            String xml = mapper.writeValueAsString(phone);
//            Good phoneFromXml = mapper.readValue(xml, Good.class);
//            System.out.println(phoneFromXml);