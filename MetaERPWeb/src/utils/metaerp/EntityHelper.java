package utils.metaerp;

import metaerp.Entity;

public class EntityHelper {
	
	private Entity entity;
	private Entity parent;
	
	public EntityHelper(Entity entity) {
		this.entity = entity;
		this.parent = null;
	}

	public Entity getParent() {
		return parent;
	}

	public void setParent(Entity parent) {
		this.parent = parent;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

}
