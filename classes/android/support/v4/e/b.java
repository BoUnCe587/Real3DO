package android.support.v4.e;

import android.os.AsyncTask;

class b {
  static <Params, Progress, Result> void a(AsyncTask<Params, Progress, Result> paramAsyncTask, Params... paramVarArgs) { paramAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramVarArgs); }
}
