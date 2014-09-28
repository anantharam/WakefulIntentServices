/**
 * 
 */
package com.anantharam.wakeful;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;

/**
 * @author ANANTHARAM
 *
 */
public interface AlarmListener {
	void scheduleAlarms(AlarmManager mgr, PendingIntent pi, Context ctxt);

	void sendWakefulWork(Context ctxt);

	long getMaxAge();
}