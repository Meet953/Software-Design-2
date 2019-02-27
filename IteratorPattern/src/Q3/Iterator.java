package Q3;
interface Iterator
{
    boolean hasNext();
    Object next();
}

interface Container
{
    Iterator iterator();
}
