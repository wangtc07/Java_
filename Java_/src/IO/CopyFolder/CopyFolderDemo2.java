package IO.CopyFolder;

import java.io.*;

public class CopyFolderDemo2 {
	public static void main(String[] args) {
		// 創建數據源目錄
		File srcFolder = new File("./Source2"); // 要複製的文件夾
		//創建目的地File對象
		File destFolder = new File("./Target2");// 目的地
		
		copyFolder(srcFolder,destFolder);
	}

	
	// 複製文件夾
	private static void copyFolder(File srcFolder, File destFolder) {
		//判斷是否是文件夾  boolean	 isDirectory()	測試此抽象路徑名表示的文件是否為目錄。
		if(srcFolder.isDirectory()) {
			// 創建和數據源同樣的文件夾
			String folderName = srcFolder.getName();
			File newFolder = new File(destFolder, folderName);
			if (!newFolder.exists()) {
				newFolder.mkdirs();
			}
			
			//獲取文件夾下所有文件
			File[] listFiles = srcFolder.listFiles();
			//遍歷 文件夾有可能也有文件夾
			for (File file : listFiles) {
				//遞迴
				copyFolder(file,newFolder);
			}
		}else {
			//說明是檔案
			File newFile = new File(destFolder,srcFolder.getName());  
			//srcFolder.getName() 檔案名稱
			copyFile(srcFolder, newFile);
		}
	}

	
	// 複製檔案
	private static void copyFile(File srcFile, File destFile) {
		try(
				FileInputStream  fis = new FileInputStream(srcFile);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(destFile);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			byte[] b = new byte[8192];
			int len;
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
