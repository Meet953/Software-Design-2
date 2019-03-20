package IteratorPattern;



class Sentence implements Iterator, Container
{
    private String value;
    private int index;


    public Sentence(String v)
    {
        value = v; index = 0;
    }

    public String readSentence()
    {
        return value;
    }

    public void update(String v)
    {
        value = v;
    }
    
    public String[] toArray()
    {
        return value.split("\\s");
    }

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Sentence(value);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < toArray().length;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		String s = toArray()[index++];
		return s;
	}
    

    
}











