package com.batzee.scannerclass;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;


public class ScannerClass extends CordovaPlugin {
	
	
	public static final String ACTION_ADD_SCANNER_ENTRY = "addScannerEntry";
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		
		try {
		    if (ACTION_ADD_SCANNER_ENTRY.equals(action)) {
		             JSONObject arg_object = args.getJSONObject(0);
		             Log.d("Native","Code Accessed");
		       callbackContext.success();
		       return true;
		    }
		    else{
		    callbackContext.error("Invalid action");
		    Log.d("Native","Code Not Accessed");
		    return false;
		    }
		    
		} catch(Exception e) {
		    Log.d("Exception",e.getMessage()+"");
		    callbackContext.error(e.getMessage());
		    return false;
		} 
		
	}
			
}
