package physics2d.components;

import components.Component;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.lwjgl.system.CallbackI;
import renderer.DebugDraw;

public class Box2DCollider extends Component {
    //region Fields
    private Vector2f offset = new Vector2f();

    private Vector2f halfSize = new Vector2f(1);
    private Vector2f origin = new Vector2f();
    //endregion

    //region Properties
    public Vector2f getOffset(){
        return this.offset;
    }
    public void setOffset(Vector2f newOffset) { this.offset.set(newOffset);}

    public Vector2f getHalfSize() {
        return halfSize;
    }

    public void setHalfSize(Vector2f halfSize) {
        this.halfSize = halfSize;
    }

    public Vector2f getOrigin(){
        return this.origin;
    }
    //endregion

    //region Override methods
    @Override
    public void editorUpdate(float dt){
        Vector2f center = new Vector2f(this.gameObject.transform.position).add(this.offset);
        DebugDraw.addBox2D(center, this.halfSize, this.gameObject.transform.rotation);
    }
    //endregion
}
