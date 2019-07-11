public class OurLinkedList
{
    private Node head;

    public OurLinkedList()
    {
        this.head = null; // creates empty list.
    }

    public void add(int value)
    {
        final Node newNode = new Node(value);

        if (this.head == null)
        // adding to empty list
        {
            this.head = newNode;
        }

        else
        // if adding to a non-empty list
        {
            Node currentNode = this.head;

            while (currentNode.getLink() != null)
            {
                currentNode = currentNode.getLink();
            }

            // We know that currentNode's link is null.
            currentNode.setLink(newNode);
        }
    }

    public void add(int position, int value)
    {
        Node newNode = new Node(value);

        if (position <= 0) // insert at front
        {
            newNode.setLink(this.head);
            this.head = newNode;
        }

        else // inserting at a positive position
        {
            // Find element before the insert position. Avoid going off the end of the list.
            Node currentNode = this.head;
            int count = 1;

            while ((currentNode.getLink() != null) && (count < position))
            {
                currentNode = currentNode.getLink();
                count++;
            }
            // We know that currentNode is the insert point.

            newNode.setLink(currentNode.getLink());
            currentNode.setLink(newNode);
        }
    }

    public void remove(int position)
    {
        if(this.head != null)
        {
            Node currentNode = this.head;

            if(position > 0)
            {
                int count = 1;

                while ((currentNode.getLink() != null) && (count < position))
                {
                    currentNode = currentNode.getLink();
                    count++;
                }

                if(currentNode.getLink() != null)
                {
                    final Node nodeToDelete = currentNode.getLink();
                    currentNode.setLink(nodeToDelete.getLink());
                }
                else remove(position -1);
            }
            else
            {
                this.head = currentNode.getLink();
            }
        }
    }

    public String toString()
    {
        String listAsString = "";
        Node currentNode = this.head;

        while (currentNode != null)
        {
            listAsString += currentNode.getValue() + " ";
            currentNode = currentNode.getLink();
        }

        return listAsString;
    }
}