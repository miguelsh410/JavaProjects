public class Node
{
    private final int value;
    private Node link;

    public Node(int value)
    {
        this.value = value;
        this.link = null;
    }

    public void setLink(Node node)
    {
        this.link = node;
    }


    public Node getLink()
    {
        return this.link;
    }

    public int getValue() {
        return this.value;
    }

    public String toString()
    {
        return this.value + "";
    }
}
