USE [NhaHangKietvaHung]
GO
/****** Object:  Table [dbo].[ChiTietDonDatMon]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietDonDatMon](
	[maDatMon] [varchar](255) NULL,
	[MonAn] [varchar](255) NULL,
	[soLuong] [int] NULL,
	[giaBan] [float] NULL,
	[thanhTien] [float] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maHoaDon] [varchar](255) NULL,
	[maMonAn] [varchar](255) NULL,
	[tenMonAn] [varchar](255) NULL,
	[loaiMonAn] [varchar](255) NULL,
	[soLuong] [int] NULL,
	[gia] [float] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonDatMon]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonDatMon](
	[maDonHang] [varchar](255) NOT NULL,
	[ngayMua] [date] NULL,
	[NV] [varchar](255) NULL,
	[KH] [varchar](255) NULL,
	[tongTien] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[maDonHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHoaDon] [varchar](255) NOT NULL,
	[tenKhachHang] [varchar](255) NULL,
	[soDienThoai] [varchar](255) NULL,
	[maNV] [varchar](255) NULL,
	[tongTien] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[maHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [varchar](255) NOT NULL,
	[hoTen] [varchar](255) NULL,
	[namSinh] [varchar](255) NULL,
	[sDT] [varchar](255) NULL,
	[gioiTinh] [varchar](255) NULL,
	[diaChi] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MonAn]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MonAn](
	[maMonAn] [varchar](255) NOT NULL,
	[tenMonAn] [varchar](255) NULL,
	[loaiMonAn] [varchar](255) NULL,
	[soLuong] [int] NULL,
	[gia] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[maMonAn] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [varchar](255) NOT NULL,
	[tenNV] [varchar](255) NULL,
	[namSinh] [varchar](255) NULL,
	[gioiTinh] [varchar](255) NULL,
	[ngayVaolam] [date] NULL,
	[sDT] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 4/9/2024 6:38:02 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[tenDangNhap] [varchar](255) NOT NULL,
	[gmail] [varchar](255) NULL,
	[matKhau] [varchar](255) NULL,
	[maNV] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[tenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[HoaDon] ([maHoaDon], [tenKhachHang], [soDienThoai], [maNV], [tongTien]) VALUES (N'HD001', N'PhamKiet', N'0933018523', N'NV001', 312312321)
INSERT [dbo].[HoaDon] ([maHoaDon], [tenKhachHang], [soDienThoai], [maNV], [tongTien]) VALUES (N'HO001', N'Pham Kiet', N'0987654321', N'NV001', 12)
GO
INSERT [dbo].[KhachHang] ([maKH], [hoTen], [namSinh], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH001', N'Pham Kiet', N'2002', N'0987654321', N'Nam', N'54 NguyenKiem')
INSERT [dbo].[KhachHang] ([maKH], [hoTen], [namSinh], [sDT], [gioiTinh], [diaChi]) VALUES (N'KH002', N'Pham Kien', N'2002', N'0123456789', N'Nam', N'45 NguyenKiem')
GO
INSERT [dbo].[MonAn] ([maMonAn], [tenMonAn], [loaiMonAn], [soLuong], [gia]) VALUES (N'MA001', N'Stead', N'MonMan', 3, 90000)
GO
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [namSinh], [gioiTinh], [ngayVaolam], [sDT]) VALUES (N'1', N'TanKiet', N'2002', N'Nam', CAST(N'2020-12-14' AS Date), N'933018523')
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [namSinh], [gioiTinh], [ngayVaolam], [sDT]) VALUES (N'NV001', N'TanKiet', N'2002', N'Nam', CAST(N'2020-12-14' AS Date), N'0933018523')
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [namSinh], [gioiTinh], [ngayVaolam], [sDT]) VALUES (N'NV003', N'Nguy?n Van H?u', N'2003', N'Nam', CAST(N'2004-07-04' AS Date), N'0148192739')
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [namSinh], [gioiTinh], [ngayVaolam], [sDT]) VALUES (N'NV004', N'Pham Hùng', N'2003', N'Nam', CAST(N'2024-08-04' AS Date), N'0822345503')
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [namSinh], [gioiTinh], [ngayVaolam], [sDT]) VALUES (N'NV005', N'Ph?mNghi', N'2003', N'N?', CAST(N'2024-08-04' AS Date), N'0822345803')
INSERT [dbo].[NhanVien] ([maNV], [tenNV], [namSinh], [gioiTinh], [ngayVaolam], [sDT]) VALUES (N'NV006', N'Nguy?n Th? Kim Lý', N'2003', N'N?', CAST(N'2004-07-04' AS Date), N'0148192779')
GO
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [gmail], [matKhau], [maNV]) VALUES (N'Nguy?n Van H?u', N'vanhau@gmai.com', N'123123', N'NV003')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [gmail], [matKhau], [maNV]) VALUES (N'Nguyen Thi Kim Ly', N'kimly@gmail.com', N'123123', N'NV006')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [gmail], [matKhau], [maNV]) VALUES (N'NV001', N'ptankiet1712@gmail.com', N'123', N'NV001')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [gmail], [matKhau], [maNV]) VALUES (N'Ph?m Nghi', N' nghipham@gmail.com', N'123123', N'NV005')
INSERT [dbo].[TaiKhoan] ([tenDangNhap], [gmail], [matKhau], [maNV]) VALUES (N'Pham Hung', N'hungpham@gmail.com', N'123123', N'NV004')
GO
ALTER TABLE [dbo].[ChiTietDonDatMon]  WITH CHECK ADD FOREIGN KEY([maDatMon])
REFERENCES [dbo].[DonDatMon] ([maDonHang])
GO
ALTER TABLE [dbo].[ChiTietDonDatMon]  WITH CHECK ADD FOREIGN KEY([MonAn])
REFERENCES [dbo].[MonAn] ([maMonAn])
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([maHoaDon])
REFERENCES [dbo].[HoaDon] ([maHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([maMonAn])
REFERENCES [dbo].[MonAn] ([maMonAn])
GO
ALTER TABLE [dbo].[DonDatMon]  WITH CHECK ADD FOREIGN KEY([KH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[DonDatMon]  WITH CHECK ADD FOREIGN KEY([NV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
