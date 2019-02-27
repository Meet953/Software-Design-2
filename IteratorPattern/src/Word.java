

class Word implements Iterator, Container
{
    private String value;
    private int index;


    public Word(String v)
    {
        value = v; index = 0;
    }

    public String readWord()
    {
        return value;
    }

    public void update(String v)
    {
        value = v;
    }

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Word(value);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index<value.toCharArray().length;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		char res=value.toCharArray() [index++];
        return res;
	}
    
    

    
}











