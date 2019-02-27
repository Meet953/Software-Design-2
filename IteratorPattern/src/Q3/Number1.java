package Q3;
class Number1 implements Container, Iterator
{
    private int value;
    private int index;

    public Number1(int v)
    {
        value = v; index = 0;
    }

    public String convertToString()
    {
        return Integer.toString(value);
    }

    public void update(int v)
    {
        value = v;
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < convertToString().length();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		char res = convertToString().charAt(index++);
		return Integer.parseInt(res + "");
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Number1(value);
	}    

}


