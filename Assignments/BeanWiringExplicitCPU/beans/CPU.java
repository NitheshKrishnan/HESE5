package edu.jspiders.beanwiringexplicit.beans;

public class CPU 
{
	private MotherBoard mb;
	private Processor pc;
	private Harddisk hd;
	private Ram ram;
	
	public CPU()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public CPU(MotherBoard mb, Processor pc, Harddisk hd, Ram ram)
	{
		this.mb = mb;
		this.pc = pc;
		this.hd = hd;
		this.ram = ram;
	}

	public MotherBoard getMb() {
		return mb;
	}

	public void setMb(MotherBoard mb) {
		this.mb = mb;
	}

	public Processor getPc() {
		return pc;
	}

	public void setPc(Processor pc) {
		this.pc = pc;
	}

	public Harddisk getHd() {
		return hd;
	}

	public void setHd(Harddisk hd) {
		this.hd = hd;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	
}
