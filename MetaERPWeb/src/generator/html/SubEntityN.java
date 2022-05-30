package generator.html;

import metaerp.Entity;

public class SubEntityN {
	
	private Entity subEntity;
	private boolean model;
	private String currentN;
	private boolean runtimeEdit;
	
	public SubEntityN(Entity createBox, boolean model, String currentN) {
		this(createBox, model, currentN, false);
	}
	
	public SubEntityN(Entity createBox, boolean model, String currentN, boolean runtimeEdit) {
		this.setSubEntity(createBox);
		this.setModel(model);
		this.setCurrentN(currentN);
		this.setRuntimeEdit(runtimeEdit);
	}
	
	/*
	 * GETTERS AND SETTERS
	 */

	public Entity getSubEntity() {
		return subEntity;
	}

	public void setSubEntity(Entity createBox) {
		this.subEntity = createBox;
	}

	public boolean isModel() {
		return model;
	}

	public void setModel(boolean model) {
		this.model = model;
	}

	public String getCurrentN() {
		return currentN;
	}

	public void setCurrentN(String currentN) {
		this.currentN = currentN;
	}

	public boolean isRuntimeEdit() {
		return runtimeEdit;
	}

	public void setRuntimeEdit(boolean runtime) {
		this.runtimeEdit = runtime;
	}
	
}
