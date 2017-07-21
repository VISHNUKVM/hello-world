package cc_demo;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class java_cs

{
	// ---( internal utility methods )---

	final static java_cs _instance = new java_cs();

	static java_cs _newInstance() { return new java_cs(); }

	static java_cs _cast(Object o) { return (java_cs)o; }

	// ---( server methods )---




	public static final void program1 (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(program1)>> ---
		// @sigtype java 3.5
		// [i] field:0:required strA
		// [i] field:0:required strB
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	strA = IDataUtil.getString( pipelineCursor, "strA" );
			String	strB = IDataUtil.getString( pipelineCursor, "strB" );
		pipelineCursor.destroy();
		
		String result;
		result = strA + strB;
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

