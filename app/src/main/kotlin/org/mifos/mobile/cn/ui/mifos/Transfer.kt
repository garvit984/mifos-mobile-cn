package org.mifos.mobile.cn.ui.mifos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.mifos.mobile.cn.R
import org.mifos.mobile.cn.ui.base.MifosBaseFragment

class Transfer : MifosBaseFragment() {
    companion object {
        fun newInstance(): Transfer = Transfer()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        getToolbar().setVisibility(View.GONE);
        return inflater.inflate(R.layout.fragment_transfer, container, false)
    }
}