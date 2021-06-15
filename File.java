public class File {
    // um arquivo tem um nome
    private String name;
    // um arquivo tem uma extensao
    private String extension;
    // um arquivo tem um tamanho
    private int size;
    private Type type;

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                ", size=" + size +
                ", type=" + type +
                "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public void printName(){
        System.out.println(name);
    }
}
