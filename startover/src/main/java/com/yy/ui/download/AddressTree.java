package com.yy.ui.download;

import java.util.List;

import javax.swing.JTree;
import javax.swing.event.EventListenerList;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import com.yy.entity.AddressVO;
import com.yy.entity.AddressWithAddressVO;

public class AddressTree extends JTree {

	private static final long serialVersionUID = -837222940215329907L;

	private AddressModel model;

	public AddressTree() {
		init();

		addTreeSelectionListener(new TreeSelectedListener());
	}

	private void init() {
		// getTreeNode();
		model = new AddressModel();

		AddressWithAddressVO root = new AddressWithAddressVO();

		model.setRoot(root);
		setModel(model);

		// 设置选择方式为单选
		getSelectionModel().setSelectionMode(
				TreeSelectionModel.SINGLE_TREE_SELECTION);
	}

	public void setModelRoot(AddressVO addressVO) {
		model.setRoot(addressVO);
	}

	/**
	 * 
	 * Desc: Tree Selected Listener
	 *
	 * @author Sapphire
	 *
	 * @Since 创建时间:2014年12月14日 下午8:54:19
	 */
	private class TreeSelectedListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {
			TreePath path = getSelectionPath();
			if (path == null) {
				System.out.println("path is null");
				return;
			}

			AddressVO nd = (AddressVO) path.getLastPathComponent();
			System.out.println();
			// System.out.println(nd.getUserObject());

			// TODO sapphire: tree select: display content.
		}
	}

	private class AddressModel implements TreeModel {

		private AddressVO root;

		private EventListenerList listenerList = new EventListenerList();

		public AddressVO getRoot() {
			return root;
		}

		public void setRoot(AddressVO root) {
			this.root = root;
		}

		public Object getChild(Object parent, int index) {
			List<AddressVO> childs = ((AddressWithAddressVO) parent)
					.getAddressVOs();

			return childs.get(index);
		}

		public int getChildCount(Object parent) {
			return getChildrenCounts(parent);
		}

		public boolean isLeaf(Object node) {
			return ((AddressVO) node).isHasImage();
		}

		public void valueForPathChanged(TreePath path, Object newValue) {

		}

		public int getIndexOfChild(Object parent, Object child) {
			for (int i = 0; i < getChildCount(parent); i++) {
				if (getChild(parent, i) == child) {
					return i;
				}
			}
			return 0;
		}

		public void addTreeModelListener(TreeModelListener l) {
			listenerList.add(TreeModelListener.class, l);
		}

		public void removeTreeModelListener(TreeModelListener l) {
			listenerList.remove(TreeModelListener.class, l);
		}

		private int getChildrenCounts(Object obj) {
			AddressWithAddressVO addressWithAddressVO = (AddressWithAddressVO) obj;
			return addressWithAddressVO.getAddressVOs() == null ? 0
					: addressWithAddressVO.getAddressVOs().size();

		}

	}

}
